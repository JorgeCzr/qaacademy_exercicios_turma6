package exercicios_easy;
//Faça um algoritmo para ler um valor de investimento, com uma
//taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
//juros e o total com juros. Considerando que a remuneração será no regime de
//juros simples.

import javax.swing.*;

public class Exec10ex2 {
    public static void main(String[] args) {
        double investimento = 1000, taxa = 0.05,valorJuros = 0;
        int ano = 1;

        while (ano <= 10) {
            valorJuros = (investimento * taxa) + valorJuros;
            ano++;
        }
        System.out.println("Valor dos Juros=" + valorJuros);
        System.out.println(("Valor investido=" + investimento));
        System.out.println("Valor Total= " + (investimento + valorJuros));

    }
}

