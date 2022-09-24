package Exercicios_medium;

import javax.swing.*;

// Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. Ao final de 10 anos,
// exibir o valor investido,
// valor dos juros, e o total. Considerando que a remuneração será no regime de juros compostos.
public class Exec2 {
    public static void main(String[] args) {
        double investimento = 0, taxaJuros = 0.05, totalJuros;
        int ano = 1, tempoInvestido = 10;
        investimento = Integer.parseInt(JOptionPane.showInputDialog("Valor Investimento"));
        totalJuros = investimento;

        while (ano <= tempoInvestido) {
            totalJuros = (totalJuros * taxaJuros) + totalJuros;
            ano++;
        }
        System.out.println("Investimento = " + investimento);
        System.out.println("Valor do Juros = " + (totalJuros - investimento));
        System.out.println("Valor Total Investimento= " + totalJuros);


    }
}
