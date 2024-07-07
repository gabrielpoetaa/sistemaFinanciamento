package modelo;

import java.io.Serializable;

public class Terreno extends Financiamento implements Serializable {
    public String tipoDaZona;

    public Terreno(double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial, String tipoDaZona) {
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
        this.tipoDaZona = tipoDaZona;
    }
    public double pagamentoMensal () {
        return super.pagamentoMensal() * 1.02 ;
    }

    @Override
    public String toString() {
        return "TIPO DO IMOVEL: TERRENO" + "\n" +
                "Valor do Imovel: " + getValorImovel() + "\n" +
                "Prazo do Financiamento: " + getPrazoFinanciamento() + "\n" +
                "Taxa de juros anual: " + getTaxaJurosAnual() + "\n" +
                "Tipo da zona: " + tipoDaZona + "\n";
    }

}
