package modelo;

public class Casa extends Financiamento {

    public Casa (double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial){
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
    }

    public double pagamentoMensal () {
        return super.pagamentoMensal() + 80;
    }
}
