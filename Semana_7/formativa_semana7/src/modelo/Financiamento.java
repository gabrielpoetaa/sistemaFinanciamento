package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Financiamento {

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

//    protected double valorImovel;
//    protected int prazoFinanciamento;
//    protected double taxaJurosAnual;

    public Financiamento(double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial) {
        this.valorImovel = valorImovelInicial;
        this.prazoFinanciamento = prazoFinanciamentoInicial;
        this.taxaJurosAnual = taxaJurosAnualInicial;
    }

    public double getValorImovel() {
        return valorImovel;
    };

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double pagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double totalPagamento() {
        double total = pagamentoMensal() * prazoFinanciamento * 12;
        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

//    public void imprimirDadosFinanciamento() {
//        System.out.println("Valor do imovel: " + valorImovel);
//        System.out.println("Prazo financiamento: " + prazoFinanciamento);
//        System.out.println("Taxa de juros anual: " + taxaJurosAnual);
//        System.out.println("Valor total do financiamento: " + totalPagamento());
//    }

}
