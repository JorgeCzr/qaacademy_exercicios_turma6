package exercicios_easy;
//Faça um algoritmo para ler um valor de investimento, com uma
//taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
//juros e o total com juros. Considerando que a remuneração será no regime de
//juros simples.

import javax.swing.*;

public class Exec10 {
    public static void main(String[] args) {
        double valorInvestido,juros,taxa =0.05,totalComJuros;

        valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Investimento"));
        juros = (10 * taxa) * valorInvestido;
        totalComJuros = valorInvestido + juros;

        System.out.println("Valor Investido é = " + valorInvestido);
        System.out.println("Valor do Juros = " + juros);
        System.out.println("Valor Total com Juros " + totalComJuros);

        }
    }

    // totalComJuros = valorInvestido*juros+valorInvestido;

//