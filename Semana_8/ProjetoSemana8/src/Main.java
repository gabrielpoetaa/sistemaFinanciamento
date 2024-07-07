import java.io.*;

public class Main {
    public static void main(String[] args) {
//        ContaCorrente contaExemplo = new ContaCorrente(1000);
//        ContaCorrente contaExemplo2 = new ContaCorrente(200);
//        String textoSaldoinicial = "O saldo atual eh de R$" + contaExemplo.getSaldo();
//        System.out.println(textoSaldoinicial);

///////////////////////////////////////////////////////////////////////////////////////////
        // Escrita

//        ObjectOutputStream outputStream = null;

//        try {
//            outputStream  = new ObjectOutputStream(new FileOutputStream("contaExemplo.test"));
//
//            outputStream.writeObject(contaExemplo);
//
//            outputStream.flush();
//            outputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
///////////////////////////////////////////////////////////////////////////////////////////

        // Leitura

        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream("contaExemplo.test"));

            Object objeto = null;
            while ((objeto = inputStream.readObject()) != null) {
                ContaCorrente conta = ((ContaCorrente) objeto);
                if (objeto instanceof ContaCorrente) {
                    System.out.println(conta.getSaldo());
                }
            }
            inputStream.close();
        } catch (EOFException e ) {
            System.out.println("Fim do arquivo alcancado");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}