package modelo;

public class Terreno extends Financiamento {

    public Terreno(double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial) {
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
    }
    public double pagamentoMensal () {
        return super.pagamentoMensal() * 1.02 ;
    }

}
