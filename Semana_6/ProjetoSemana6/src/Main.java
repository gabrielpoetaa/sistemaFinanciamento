public class Main {
    public static void main (String[] args) {
        Veiculo motoDoVizinho = new Moto("Honda", "Motor da Honda", 250);
        Veiculo nossoCaminhao = new Caminhao("Volvo", "Motor Aleatorio", 4,  20);

//        System.out.println("O carro do vizinho e um: " + carroDoVizinho.getMarca());
//        System.out.println("O nosso caminhao e um: " + nossoCaminhao.getMarca());

        motoDoVizinho.getDetalhes();
        nossoCaminhao.getDetalhes();

//        nossoCaminhao.getDetalhes(10);

//        motoDoVizinho.getSom();
//        nossoCaminhao.getSom();


    }
}

