public class Main {
    public static void main (String[] args) {
        Veiculo carroDoVizinho = new Veiculo("Peugeot", "1.6 THP");
        Caminhao nossoCaminhao = new Caminhao("Volvo", "Motor Aleatorio", 4,  20);
        Moto nossaMoto = new Moto("Honda", "1.6 Turbo", 20);

//        System.out.println("O carro do vizinho e um: " + carroDoVizinho.getMarca());
//        System.out.println("O nosso caminhao e um: " + nossoCaminhao.getMarca());

        carroDoVizinho.getDetalhes();
        nossoCaminhao.getDetalhes();

        nossoCaminhao.getDetalhes(10);

        carroDoVizinho.getSom();
        nossoCaminhao.getSom();
    }
}

