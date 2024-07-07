package modelo;

import util.AcrescimoMaiorQueJurosException;

import java.io.Serializable;

public class Casa extends Financiamento implements Serializable {
    private double areaConstruida;
    private double areaTerreno;
    private double valorJurosMensal;

    public Casa(double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial, double areaConstruida, double areaTerreno) {
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    // Getter para obter a area construída
    public double getAreaConstruida() {
        return this.areaConstruida;
    }

    // Getter para obter a area do terreno
    public double getAreaDoTerreno() {
        return this.areaTerreno;
    }

    private void isAcrescimoMaiorQueJuros(double valorAcrescimo, double valorJurosMensal) throws AcrescimoMaiorQueJurosException {
        if (valorAcrescimo > valorJurosMensal) {
            throw new AcrescimoMaiorQueJurosException(
                    String.format("O acréscimo de R$ %.2f é maior que os juros de R$ %.2f mensais", valorAcrescimo, valorJurosMensal));
        }
    }



    public double pagamentoMensal() {
        double valorAcrescimo = 500;
        double pagamentoMensalSemJuros = getValorImovel() / (getPrazoFinanciamento() * 12);
        double calcPagamentoMensal = getValorImovel() / (getPrazoFinanciamento() * 12) * (1 + (getTaxaJurosAnual() / 12));
        valorJurosMensal = calcPagamentoMensal - pagamentoMensalSemJuros;

        try {
            isAcrescimoMaiorQueJuros(valorAcrescimo, valorJurosMensal);
        } catch (AcrescimoMaiorQueJurosException e) {
            System.out.println(e.getMessage());
            valorAcrescimo = valorJurosMensal;
        }
        return super.pagamentoMensal() + valorAcrescimo;
    }

    @Override
    public String toString() {
        return "TIPO DO IMOVEL: CASA" + "\n" +
                "Valor do Imovel: " + getValorImovel() + "\n" +
                "Prazo do Financiamento: " + getPrazoFinanciamento() + "\n" +
                "Taxa de juros anual: " + getTaxaJurosAnual() + "\n" +
                "Area construida: " + areaConstruida + "\n" +
                "Area do terreno: " + areaTerreno + "\n";
    }


}
