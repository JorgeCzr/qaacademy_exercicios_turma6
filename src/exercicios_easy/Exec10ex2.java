package exercicios_easy;
//Faça um algoritmo para ler um valor de investimento, com uma
//taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
//juros e o total com juros. Considerando que a remuneração será no regime de
//juros simples.

import javax.swing.*;

public class Exec10ex2 {
    public double calcularValorJuros(double valorInvestimento){
        double valorJuros = 0.0, taxaJuros = 0.05,ano = 1;
        valorInvestimento = 1000;

        while (ano <= 10) {
            valorJuros = (valorInvestimento * taxaJuros) + valorJuros;
            ano++;
        }
            return valorJuros;
        }

}

