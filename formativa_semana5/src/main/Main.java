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
            double taxaJurosAnual = intUsuario.getTaxaFinanciamento();

            // Inicializa instancia de Financiamento com base no tipo de imóvel
            Financiamento financiamento;
            financiamento = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual);

            listaFinanciamento.add(financiamento);

//          IMOVEL 2 - CASA
            double valorImovel2 = 0;
            int prazoFinanciamento2 = 15;
            double taxaJurosAnual2 = 0;

            financiamento = new Casa(valorImovel2, prazoFinanciamento2, taxaJurosAnual2);

            listaFinanciamento.add(financiamento);

//          IMOVEL 3 - APARTAMENTO
            double valorImovel3 = 0;
            int prazoFinanciamento3 = 5;
            double taxaJurosAnual3 = 0;

            financiamento = new Apartamento(valorImovel3, prazoFinanciamento3, taxaJurosAnual3);

            listaFinanciamento.add(financiamento);

//          IMOVEL 4 - APARTAMENTO
            double valorImovel4 = 0;
            int prazoFinanciamento4 = 0;
            double taxaJurosAnual4 = 0;

            financiamento = new Apartamento(valorImovel4, prazoFinanciamento4, taxaJurosAnual4);

            listaFinanciamento.add(financiamento);


//          IMOVEL 5 - TERRENO
            double valorImovel5 = 0;
            int prazoFinanciamento5 = 25;
            double taxaJurosAnual5 = 0;

            financiamento = new Terreno(valorImovel5, prazoFinanciamento5, taxaJurosAnual5);
            listaFinanciamento.add(financiamento);

            double somaValoresImoveis = 0;
            double somaValoresFinanciamentos = 0;
            double pagamentoMensal = 0;
            double somaTaxas = 0;

            for (Financiamento f : listaFinanciamento) {
                somaValoresImoveis += f.getValorImovel();
                somaValoresFinanciamentos += f.totalPagamento();
            }

            // Exibição dos resultados
            System.out.println("Soma dos valores dos imóveis: " + somaValoresImoveis);
            System.out.println("Soma dos valores dos financiamentos: " + somaValoresFinanciamentos);
    }
        }


