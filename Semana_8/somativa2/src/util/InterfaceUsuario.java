package util;

import java.util.Scanner;

import java.util.Scanner;
import java.util.InputMismatchException;

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

    // Atributo TERRENO

    public String tipoDaZona;


    public int escolherTipoImovel() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Escolha o tipo de imóvel:");
            System.out.println("1 - Casa");
            System.out.println("2 - Apartamento");
            System.out.println("3 - Terreno");

            try {
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > 3) {
                    throw new IllegalArgumentException("Opção inválida. Escolha um número entre 1 e 3.");
                }
                inputValido = true;
            } catch (Exception e) {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }

        return opcao;
    }
    public void pedirValorImovel() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Qual o valor do imovel? ");
            try {
                int valor = scanner.nextInt();
                if (valor <= 0) {
                    throw new IllegalArgumentException("O valor do imovel precisa ser maior que zero.");
                }
                this.valorImovel = valor;
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }
    public void pedirPrazoFinanciamento() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Digite o prazo de financiamento (em anos): ");
            try {
                int valor = scanner.nextInt();
                if (valor <= 0) {
                    throw new IllegalArgumentException("O prazo de financiamento precisa ser maior que zero.");
                }
                this.prazo = valor;
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void pedirTaxaDeJuros() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Digite a taxa de juros:  ");
            try {
                int valor = scanner.nextInt();
                if (valor <= 0) {
                    throw new IllegalArgumentException("A taxa de juros precisa ser maior que zero.");
                }
                this.taxa = valor;
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void pedirAreaConstruida() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Qual a area construida? ");
            try {
                int valor = scanner.nextInt();
                if (valor <= 0) {
                    throw new IllegalArgumentException("A area construida precisa ser maior que zero.");
                }
                this.areaConstruida = valor;
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void pedirAreaTerreno() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Qual a area do terreno? ");
            try {
                int valor = scanner.nextInt();
                if (valor <= 0) {
                    throw new IllegalArgumentException("A area do terreno precisa ser maior que zero.");
                }
                this.areaTerreno = valor;
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void pedirVagaDeGaragem() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Quantas vagas de garagem? ");
            try {
                int valor = scanner.nextInt();
                if (valor < 0) {
                    throw new IllegalArgumentException("A quantidade de vagas nao pode ser menor que zero");
                }
                this.vagasDeGaragem = valor;
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void pedirNumeroDoAndar() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Qual o numero do andar? ");
            try {
                int valor = scanner.nextInt();
                if (valor < 0) {
                    throw new IllegalArgumentException("O numero do andar nao pode ser menor que zero");
                }
                this.numeroDoAndar = valor;
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String pedirTipoDaZona() {
        Scanner scanner = new Scanner(System.in);
        String tipoDaZona = null;
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Qual o tipo de zona do terreno (Residencial ou Comercial)? ");
            tipoDaZona = scanner.nextLine().trim();

            if (tipoDaZona.equalsIgnoreCase("Residencial") || tipoDaZona.equalsIgnoreCase("Comercial")) {
                inputValido = true;
            } else {
                System.out.println("Opção inválida. Por favor, escolha entre 'Residencial' ou 'Comercial'.");
            }
        }

        return tipoDaZona;
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
    public int getVagasDeGaragem() { return this.vagasDeGaragem; }

    // Getter para obter o numero do andar
    public int getNumeroDoAndar() { return this.numeroDoAndar; }

    public String getTipoDaZona() {
        return this.tipoDaZona;
    }

    void imprimirDados(int prazoFinanciamento) {
        System.out.println("O prazo de financiamento foi: ");
    }
}
