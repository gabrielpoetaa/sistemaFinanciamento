public class Main {
    public static void main(String[] args) {
        ContaCorrente contaExemplo = new ContaCorrente( 1000 );
        System.out.println("O saldo atual eh de R$" + contaExemplo.getSaldo());

        // vamos sacar R$800
        contaExemplo.sacar(800);
        System.out.println("O saldo atual eh de R$" + contaExemplo.getSaldo());

//        // vamos sacar R$200
//        contaExemplo.sacar(200);
//        System.out.println("O saldo atual eh de R$" + contaExemplo.getSaldo());

        // vamos sacar R$1000000
        contaExemplo.sacar(1000000);
        System.out.println("O saldo atual eh de R$" + contaExemplo.getSaldo());

    }
}