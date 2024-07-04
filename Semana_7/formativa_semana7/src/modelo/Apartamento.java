package modelo;

public class Apartamento extends Financiamento {

    private int vagasDeGaragem;
    private int numeroDoAndar;

    public Apartamento(double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial, int vagasDeGaragem, int numeroDoAndar) {
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
        this.vagasDeGaragem = vagasDeGaragem;
        this.numeroDoAndar = numeroDoAndar;
    }

    public double pagamentoMensal () {

        // Calcular a taxa mensal
        double taxaMensal = getTaxaJurosAnual() / 12;

        // Calcular o financiamento em meses
        double meses = getPrazoFinanciamento() * 12;

        return getValorImovel()*Math.pow(1 + taxaMensal, meses) / Math.pow(1 + taxaMensal, meses - 1);
    }

        // Getter para obter o numero de vagas de garagem
        public double getVagasDeGaragem() { return this.vagasDeGaragem; }

        // Getter para obter o numero do andar
        public double getNumeroDoAndar() { return this.numeroDoAndar; }
}
