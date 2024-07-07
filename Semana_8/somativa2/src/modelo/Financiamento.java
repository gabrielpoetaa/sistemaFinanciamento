package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Financiamento implements Serializable {

    private double valorImovel;
    private double prazoFinanciamento;
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

    public double getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double pagamentoMensal() {
        double principal = this.valorImovel;
        double annualRate = this.taxaJurosAnual / 100;
        double monthlyRate = annualRate / 12;
        double numberOfPayments = this.prazoFinanciamento * 12;

        double numerator = principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments);
        double denominator = Math.pow(1 + monthlyRate, numberOfPayments) - 1;
        double monthlyPayment = numerator / denominator;

        BigDecimal bd = new BigDecimal(monthlyPayment).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double totalPagamento() {
        double total = pagamentoMensal() * prazoFinanciamento * 12;
        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


    public double pagamentoMensalSemJuros(){
        return valorImovel / (prazoFinanciamento * 12);
    }

//    public double valorJurosMensal(){
//        double total1 = pagamentoMensal() - pagamentoMensalSemJuros();
//        BigDecimal bd = new BigDecimal(total1).setScale(2, RoundingMode.HALF_UP);
//        return bd.doubleValue();
//    }

    public double getPagamentoMensal(){
        return this.pagamentoMensal();
    }

    public double getPagamentoMensalSemJuros (){
        return this.pagamentoMensalSemJuros();
    }
//    public double getValorJurosMensal(){
//        return this.valorJurosMensal();
//    }

//    public void imprimirDadosFinanciamento() {
//        System.out.println("Valor do imovel: " + valorImovel);
//        System.out.println("Prazo financiamento: " + prazoFinanciamento);
//        System.out.println("Taxa de juros anual: " + taxaJurosAnual);
//        System.out.println("Valor total do financiamento: " + totalPagamento());
//    }

}
