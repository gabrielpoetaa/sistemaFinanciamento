package modelo;

public class Casa extends Financiamento {

   private double areaConstruida;
   private double areaTerreno;


    public Casa (double valorImovelInicial, int prazoFinanciamentoInicial, double taxaJurosAnualInicial, double areaConstruida, double areaTerreno){
        super(valorImovelInicial, prazoFinanciamentoInicial, taxaJurosAnualInicial);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }



    // Getter para obter a area construida
    public double getAreaConstruida() { return this.areaConstruida; }

    // Getter para obter a area do terreno
    public double getAreaDoTerreno() { return this.areaTerreno; }

    public double pagamentoMensal () {
        return super.pagamentoMensal() + 80;
    }
}
