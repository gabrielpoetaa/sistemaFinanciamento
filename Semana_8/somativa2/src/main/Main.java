// Fundamentos da Programacao Orientada a Objetos
// Atividade Somativa 2
// Aluno: Gabriel Moraes
// Curso: Analise e Desenvolvimento de Sistemas


package main;

import modelo.*;
import util.InterfaceUsuario;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        escreverArrayList("lista.txt");

        System.out.println("IMPRESSAO DO ARRAYLIST: \n");
        lerArrayList("lista.txt");
    }

    public static void escreverArrayList(String filename) {
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        // Criar instância de InterfaceUsuario para interação com o usuário
        InterfaceUsuario intUsuario = new InterfaceUsuario();

        // Solicitar ao usuário que escolha o tipo de imóvel
        int opcaoImovel = intUsuario.escolherTipoImovel();

        // Capturar os dados específicos de acordo com o tipo de imóvel selecionado
        switch (opcaoImovel) {
            case 1: // Casa
                cadastrarCasa(intUsuario, listaFinanciamentos);
                break;
            case 2: // Apartamento
                cadastrarApartamento(intUsuario, listaFinanciamentos);
                break;
            case 3: // Terreno
                cadastrarTerreno(intUsuario, listaFinanciamentos);
                break;
            default:
                System.out.println("Opção inválida. Saindo...");
                return;
        }

        // Imoveis pre-estabelecidos
//        Financiamento casa = new Casa(250000, 15, 12, 150, 300);
//        Financiamento apartamento1 = new Apartamento(200000, 9, 9, 2, 8);
//        Financiamento apartamento2 = new Apartamento(300000, 10, 0, 1, 12);
//        Financiamento terreno = new Terreno(150000, 1, 0, "Residencial");
//
//        listaFinanciamentos.add(casa);
//        listaFinanciamentos.add(apartamento1);
//        listaFinanciamentos.add(apartamento2);
//        listaFinanciamentos.add(terreno);

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));

            // Escrevendo o ArrayList de financiamentos
            outputStream.writeObject(listaFinanciamentos);

            outputStream.flush();
            outputStream.close();

            System.out.println("ArrayList de financiamentos foi escrito no arquivo com sucesso!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cadastrar uma Casa com base nos dados fornecidos pelo usuário
    private static void cadastrarCasa(InterfaceUsuario intUsuario, ArrayList<Financiamento> listaFinanciamentos) {
        // Pedir ao usuário os dados da casa
        intUsuario.pedirValorImovel();
        double valorImovel = intUsuario.getValorImovel();

        intUsuario.pedirPrazoFinanciamento();
        int prazoFinanciamento = intUsuario.getPrazoFinanciamento();

        intUsuario.pedirTaxaDeJuros();
        double taxaJurosAnual = intUsuario.getTaxaFinanciamento();

        intUsuario.pedirAreaConstruida();
        double areaConstruida = intUsuario.getAreaConstruida();

        intUsuario.pedirAreaTerreno();
        double areaTerreno = intUsuario.getAreaDoTerreno();

        // Criar objeto Casa e adicionar à lista de financiamentos
        Financiamento financiamento = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, areaTerreno);
        listaFinanciamentos.add(financiamento);
    }

    // Método para cadastrar um Apartamento com base nos dados fornecidos pelo usuário
    private static void cadastrarApartamento(InterfaceUsuario intUsuario, ArrayList<Financiamento> listaFinanciamentos) {
        // Pedir ao usuário os dados do apartamento
        intUsuario.pedirValorImovel();
        double valorImovel = intUsuario.getValorImovel();

        intUsuario.pedirPrazoFinanciamento();
        int prazoFinanciamento = intUsuario.getPrazoFinanciamento();

        intUsuario.pedirTaxaDeJuros();
        double taxaJurosAnual = intUsuario.getTaxaFinanciamento() / 12;

        // Número de vagas de garagem e número do andar são específicos de apartamento
        intUsuario.pedirVagaDeGaragem();
        int vagasGaragem = intUsuario.getVagasDeGaragem();

        intUsuario.pedirNumeroDoAndar();
        int numeroAndar = intUsuario.getNumeroDoAndar();

        // Criar objeto Apartamento e adicionar à lista de financiamentos
        Financiamento financiamento = new Apartamento(valorImovel, prazoFinanciamento, taxaJurosAnual, vagasGaragem, numeroAndar);
        listaFinanciamentos.add(financiamento);
    }

    // Método para cadastrar um Terreno com base nos dados fornecidos pelo usuário
    private static void cadastrarTerreno(InterfaceUsuario intUsuario, ArrayList<Financiamento> listaFinanciamentos) {
        // Pedir ao usuário os dados do terreno
        intUsuario.pedirValorImovel();
        double valorImovel = intUsuario.getValorImovel();

        intUsuario.pedirPrazoFinanciamento();
        int prazoFinanciamento = intUsuario.getPrazoFinanciamento();

        intUsuario.pedirTaxaDeJuros();
        double taxaJurosAnual = intUsuario.getTaxaFinanciamento() / 12;

        // Tipo do terreno é específico de terreno
        intUsuario.pedirTipoDaZona();
        String tipoDaZona = intUsuario.getTipoDaZona();

        // Criar objeto Terreno e adicionar à lista de financiamentos
        Financiamento financiamento = new Terreno(valorImovel, prazoFinanciamento, taxaJurosAnual, tipoDaZona);
        listaFinanciamentos.add(financiamento);
    }

    public static void lerArrayList(String filename) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));

            ArrayList<Financiamento> listaFinanciamentos = (ArrayList<Financiamento>) inputStream.readObject();
            double somaValoresImoveis = 0;
            double somaValoresFinanciamentos = 0;

            for (Financiamento financiamento : listaFinanciamentos) {
                somaValoresImoveis += financiamento.getValorImovel();
                somaValoresFinanciamentos += financiamento.totalPagamento();

                if (financiamento instanceof Casa) {
                    System.out.println(((Casa) financiamento).toString());
                } else if (financiamento instanceof Apartamento) {
                    System.out.println(((Apartamento) financiamento).toString());
                } else if (financiamento instanceof Terreno) {
                    System.out.println(((Terreno) financiamento).toString());

                }
            }
            System.out.println("------------------------------");
            System.out.println("A soma dos valores dos imoveis: " + somaValoresImoveis);
            System.out.println("A soma dos valores dos financiamentos: " + somaValoresFinanciamentos);


            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
