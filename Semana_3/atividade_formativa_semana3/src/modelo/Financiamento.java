package modelo;

public class Financiamento {

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

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
        return pagamentoMensal() * prazoFinanciamento * 12;
    }

    public void imprimirDadosFinanciamento() {
        System.out.println("Valor do imovel: " + valorImovel);
        System.out.println("Prazo financiamento: " + prazoFinanciamento);
        System.out.println("Taxa de juros anual: " + taxaJurosAnual);
    }

}
