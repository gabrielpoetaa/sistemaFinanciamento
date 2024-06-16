package main;// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import modelo.*;
import util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> listaFinanciamento = new ArrayList<>();

        int contadorImovel = 1;
        for (int i = 0; i<4; i++){
            System.out.println();
            System.out.println("IMOVEL " + contadorImovel);
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

            // Inicializa instancia de Financiamento
            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            listaFinanciamento.add(financiamento);

            contadorImovel++;
        }

        System.out.println("Lista dos financiamentos:");
        System.out.println();

        int contadorFinanciamento = 1;
        double valorImovelTotal = 0.0;
        double valorFinanciamentoTotal = 0.0;

        for (Financiamento financiamento : listaFinanciamento){

            double valorImovelContador = financiamento.getValorImovel();
            valorImovelTotal += valorImovelContador;

            double valorFinanciamentoContador = financiamento.totalPagamento();
            valorFinanciamentoTotal += valorFinanciamentoContador;

            System.out.println("Financiamento " + contadorFinanciamento + ": " );
            financiamento.imprimirDadosFinanciamento();
            System.out.println();
            contadorFinanciamento++;
            }

        System.out.println("Valor total de todos os imoveis: " + valorImovelTotal);
        System.out.println("Valor total de todos os financiamentos: " + valorFinanciamentoTotal);
    }
}
