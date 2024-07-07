import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        ContaCorrente contaExemplo = new ContaCorrente( 1000 );
        String textoSaldoinicial = "O saldo atual eh de R$" + contaExemplo.getSaldo();
        System.out.println(textoSaldoinicial);


        //Escrita
        FileWriter escritor = null;

        try {
            escritor = new FileWriter("qualquerCoisa2.txt", false);
            escritor.write(textoSaldoinicial);

//            int contadorLetras = 0;
//            while (contadorLetras < textoSaldoinicial.length()) {
//                escritor.write(textoSaldoinicial.charAt(contadorLetras));
//                contadorLetras++;
//            }

            escritor.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo nao foi encontrado");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leitura
        FileReader leitorArquivos = null;
        try {
            leitorArquivos = new FileReader("qualquerCoisa2.txt");
            int caracterLido;
            while ((caracterLido = leitorArquivos.read()) != -1) {
                System.out.print((char)caracterLido);
            }
            leitorArquivos.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo nao foi encotrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}