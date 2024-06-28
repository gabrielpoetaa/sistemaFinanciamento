package util;

import java.util.Scanner;

public class InterfaceUsuario {

    private double valorImovel;
    private int prazo;
    double taxa;

    // Atributos CASA
    private double areaConstruida;
    private double areaTerreno;

    // Atributos APARTAMENTO
    private int vagasDeGaragem;
    private int numeroDoAndar;

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

        while (true) {
            System.out.println("Digite o prazo de financiamento (em anos): ");
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                if (valor > 0) {
                    this.prazo = valor;
                    break;
                } else {
                    System.out.println("O prazo de financiamento precisa ser maior que zero.");
                }
            } else {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
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
    public void pedirAreaConstruida() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Qual a area construida?");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                System.out.println("A area construida precisa ser maior que zero.");
            } else {
                this.areaConstruida = valor;
                break;
            }
        }
    }

    public void pedirAreaTerreno() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Qual a area do terreno?");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                System.out.println("A area do terreno precisa ser maior que zero.");
            } else {
                this.areaTerreno = valor;
                break;
            }
        }
    }

    public void pedirVagaDeGaragem() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Quantas vagas de garagem?");
            int valor = scanner.nextInt();

            if (valor < 0) {
                System.out.println("A quantidade de vagas nao pode ser menor que zero");
            } else {
                this.vagasDeGaragem = valor;
                break;
            }
        }
    }

    public void pedirNumeroDoAndar() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Quantas vagas de garagem?");
            int valor = scanner.nextInt();

            if (valor < 0) {
                System.out.println("A quantidade de vagas nao pode ser menor que zero");
            } else {
                this.numeroDoAndar = valor;
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

   // Getter para obter a area construida
    public double getAreaConstruida() { return this.areaConstruida; }

    // Getter para obter a area do terreno
    public double getAreaDoTerreno() { return this.areaTerreno; }

    // Getter para obter o numero de vagas de garagem
    public double getVagasDeGaragem() { return this.vagasDeGaragem; }

    // Getter para obter o numero do andar
    public double getNumeroDoAndar() { return this.numeroDoAndar; }

    void imprimirDados(int prazoFinanciamento) {
        System.out.println("O prazo de financiamento foi: " + prazoFinanciamento);
    }
}
