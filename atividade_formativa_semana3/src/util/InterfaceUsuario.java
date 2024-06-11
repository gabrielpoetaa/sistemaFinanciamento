package util;

import modelo.*;
import java.util.Scanner;

public class InterfaceUsuario {

    private double valorImovel;
    private int prazo;
    double taxa;

    public void pedirValorImovel() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Qual o valor do imovel?");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                System.out.println("O valor precisa ser maior que zero.");
            } else {
                this.valorImovel = valor;
                break;
            }
        }
    }


    public void pedirPrazoFinanciamento() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Qual o prazo do financiamento em anos?");
            int valor = scanner.nextInt();

            if (valor < 0) {
                System.out.println("O prazo de financimento precisa ser maior que 1 ano");
            } else {
                this.prazo = valor;
                break;
            }
        }
    }

    public void pedirTaxaDeJuros() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Qual a taxa de juros?");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                System.out.println("A taxa de juros precisa ser maior que zero.");
            } else {
                this.taxa = valor;
                break;
            }
        }
    }

    // Getter para obter o valor do imovel
    public double getValorImovel() {
        return this.valorImovel;
    }

    // Getter para obter o prazo do financiamento
    public int getPrazoFinanciamento() {
        return this.prazo;
    }

    // Getter para obter a taxa do financiamento
    public double getTaxaFinanciamento() {
        return this.taxa;
    }

    void imprimirDados(int prazoFinanciamento) {
        System.out.println("O prazo de financiamento foi: " + prazoFinanciamento);
    }
}