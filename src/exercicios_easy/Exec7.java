package exercicios_easy;

import javax.swing.*;

//Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:

//Neste exercicio use o double nas variaveis e o Double.parseDouble(JOptionPane.showInputDialog para ler
//caso opte pelo float na variavel use o Float.parseFloat(JOptionPane.showInputDialog para ler

public class Exec7 {
//    public static double calcularSalarioInss(double salario) {
//        double inss = 0;
//        if (salario <= 1045.00) {
//            inss = salario * 0.075;
//        }
//        if (salario >= 1045.01 && salario <= 2089.60) {
//            inss = salario * 0.09;
//        }
//
//        if (salario >= 2089.61 && salario <= 3134.40) {
//            inss = salario * 0.12;
//        }
//        if (salario >= 3134.41 && salario <= 6101.06) {
//            inss = salario * 0.14;
//        }
//        if (salario > 6101.06) {
//            inss = 854.15;
//        }
//        return inss;

//    Ex: 2

    public static double calcularSalarioInss(double salario) {
        double inss = 0.0;
        if (salario <= 1045.00) {
            inss = salario * 0.075;

        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;

        }

        if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;

        }
        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;

        }
        if (salario > 6101.06) {
            inss = 854.15;

        }
        return inss;

    }
}

