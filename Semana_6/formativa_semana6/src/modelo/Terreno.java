package modelo;

public class Terreno extends Financiamento {

    private String tipoDaZona;

    public Terreno(double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial, String tipoDaZona) {
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
        this.tipoDaZona = tipoDaZona;
    }
    public double pagamentoMensal () {
        return super.pagamentoMensal() * 1.02 ;
    }

}
