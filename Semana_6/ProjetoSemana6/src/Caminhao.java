public class Caminhao extends Veiculo {

    // Atributos
    private int numeroEixos;
    private int capacidadeEmToneladas;

    // Construtor

    Caminhao (String marcaDoCaminhao, String motorDoCaminhao, int numeroEixosCaminhao, int capacidadeToneladas){
        super(marcaDoCaminhao, motorDoCaminhao ); // chame o construtor do Veiculo
        this.marca = marcaDoCaminhao;
        this.numeroEixos = numeroEixosCaminhao;
        this.capacidadeEmToneladas = capacidadeToneladas;
    }

    // Metodos


    public int getNumeroEixos() {
        return numeroEixos;
    }

    public int getCapacidadeEmToneladas() {
        return capacidadeEmToneladas;
    }

     // override: sobrescrita de metodos
    public void getDetalhes(){
        System.out.println("O nosso caminhao tem uma capacidade de " + getCapacidadeEmToneladas() + " tonaledas.");
    }

    // overload: sobrecarga de metodos
    public void getDetalhes (boolean mostrarEixos) {
        if (mostrarEixos){
            System.out.println("O caminhao tem " + getNumeroEixos() + " eixos.");
        } else{
            System.out.println("Nao mostrarei nada sobre os eixos");
        }
    }

    public void getDetalhes(int quantidadeLinhasEmBranco){
        for (int i = 0; i < quantidadeLinhasEmBranco; i++){
            System.out.println();
        }
    }

    public void getSom() {
        System.out.println("Os caminhoes sao grandes e barulhentos.");
    }

}
