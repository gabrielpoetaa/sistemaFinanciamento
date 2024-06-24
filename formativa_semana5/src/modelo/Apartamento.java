package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial) {
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
    }

    public double pagamentoMensal () {

        // Calcular a taxa mensal
        double taxaMensal = getTaxaJurosAnual() / 12;

        // Calcular o financiamento em meses
        double meses = getPrazoFinanciamento() * 12;

        return getValorImovel()*Math.pow(1 + taxaMensal, meses) / Math.pow(1 + taxaMensal, meses - 1);
    }
}
