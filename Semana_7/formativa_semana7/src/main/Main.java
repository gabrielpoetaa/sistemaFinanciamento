package main;// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import modelo.*;
import util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> listaFinanciamento = new ArrayList<>();

            System.out.println();
            System.out.println("IMOVEL 1 - CASA");
            // Inicializa instancia de InterfaceUsuario
            InterfaceUsuario intUsuario = new InterfaceUsuario();

            // Pede o valor do imovel e usa o getter para armazenar o valor em uma variavel
            intUsuario.pedirValorImovel();
            double valorImovel = intUsuario.getValorImovel();

            // Pede o prazo de financiamento e usa o getter para armazenar o valor em uma variavel
            intUsuario.pedirPrazoFinanciamento();
            int prazoFinanciamento = intUsuario.getPrazoFinanciamento();

            // Pede a taxa de financiamento e usa o getter para armazenar o valor em uma variavel
            intUsuario.pedirTaxaDeJuros();
            double taxaJurosAnual = intUsuario.getTaxaFinanciamento() / 12;

            // Pedir a area construida
            intUsuario.pedirAreaConstruida();
            double areaConstruida = intUsuario.getAreaConstruida();

            // Pedir a area do terreno
            intUsuario.pedirAreaTerreno();
            double areaTerreno = intUsuario.getAreaDoTerreno();

            // Inicializa instancia de Financiamento com base no tipo de imóvel
            Financiamento financiamento;

            financiamento = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, areaTerreno);

            listaFinanciamento.add(financiamento);



////          IMOVEL 2 - CASA
//            double valorImovel2 = 0;
//            int prazoFinanciamento2 = 15;
//            double taxaJurosAnual2 = 0;
//            double areaConstruida2 = 2;
//            double areaTerreno2 = 3;
//
//            financiamento = new Casa(valorImovel2, prazoFinanciamento2, taxaJurosAnual2, areaConstruida2, areaTerreno2);
//
//            listaFinanciamento.add(financiamento);
//
////          IMOVEL 3 - APARTAMENTO
//            double valorImovel3 = 0;
//            int prazoFinanciamento3 = 5;
//            double taxaJurosAnual3 = 0;
//            int vagasDeGaragem3 = 2;
//            int numeroDoAndar3 = 8;
//
//            financiamento = new Apartamento(valorImovel3, prazoFinanciamento3, taxaJurosAnual3, vagasDeGaragem3, numeroDoAndar3);
//
//            listaFinanciamento.add(financiamento);
//
////          IMOVEL 4 - APARTAMENTO
//            double valorImovel4 = 0;
//            int prazoFinanciamento4 = 0;
//            double taxaJurosAnual4 = 0;
//            int vagasDeGaragem4 = 1;
//            int numeroDoAndar4 = 10;
//
//            financiamento = new Apartamento(valorImovel4, prazoFinanciamento4, taxaJurosAnual4, vagasDeGaragem4, numeroDoAndar4);
//
//            listaFinanciamento.add(financiamento);
//
//
////          IMOVEL 5 - TERRENO
//            double valorImovel5 = 0;
//            int prazoFinanciamento5 = 25;
//            double taxaJurosAnual5 = 0;
//            String tipoDaZona5 = "Residencial";
//
//            financiamento = new Terreno(valorImovel5, prazoFinanciamento5, taxaJurosAnual5, tipoDaZona5);
//            listaFinanciamento.add(financiamento);


            double somaValoresImoveis = 0;
            double somaValoresFinanciamentos = 0;
            double somaTaxas = 0;
            double somaAreaTerreno = 0;
            double somaAreaConstruida = 0;
            int somaVagasDeGaragem = 0;
            int somaNumeroDoAndar = 0;
            double pagamentoMensal = financiamento.getPagamentoMensal();
            double pagamentoMensalSemJuros = financiamento.getPagamentoMensalSemJuros();

        for (Financiamento f : listaFinanciamento) {
                Casa casa = (Casa) financiamento; // Fazendo cast para Casa

//                double valorJurosMensal = casa.getValorJurosMensal();
//                double valorAcrescimo = casa.getValorAcrescimo();

//                System.out.println("Valor dos juros mensais: " + valorJurosMensal);
//                System.out.println("Valor do acréscimo: " + valorAcrescimo);

                somaValoresImoveis += f.getValorImovel();
                somaValoresFinanciamentos += f.totalPagamento();

            if (f instanceof Casa) {
                somaAreaConstruida += ((Casa) f).getAreaConstruida();
                somaAreaTerreno += ((Casa) f).getAreaDoTerreno();
            }

            if (f instanceof Apartamento) {
                somaVagasDeGaragem += ((Apartamento) f).getVagasDeGaragem();
                somaNumeroDoAndar += ((Apartamento) f).getNumeroDoAndar();
            }

            }

//            System.out.println("Soma dos valores dos imóveis: " + somaValoresImoveis);
//            System.out.println("Soma dos valores dos financiamentos: " + somaValoresFinanciamentos);
//            System.out.println("Soma das areas construidas: " + somaAreaConstruida);
//            System.out.println("Soma das areas dos terrenos: " + somaAreaTerreno);
//            System.out.println("Soma das vagas de garagem: " + somaVagasDeGaragem);
//            System.out.println("Soma das vagas de garagem: " + somaNumeroDoAndar);
//            System.out.println("O pagamento mensal eh " + pagamentoMensal);
//            System.out.println("O pagamento mensal sem juros " + pagamentoMensalSemJuros);
//            System.out.println("O valor mensal dos juros eh de " + valorDosJuros);

//            System.out.println("O terreno eh do tipo " + tipoDaZona5);

    }
        }


