package main;// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import modelo.*;
import util.*;

public class Main {
    public static void main(String[] args) {

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
        Financiamento fcto = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        fcto.imprimirDadosFinanciamento();

    }
}