package exercicios_easy;

import javax.swing.*;

//Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:

//Neste exercicio use o double nas variaveis e o Double.parseDouble(JOptionPane.showInputDialog para ler
//caso opte pelo float na variavel use o Float.parseFloat(JOptionPane.showInputDialog para ler

public class Exec7 {
    public static void main(String[] args) {
        double salario,inss;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
        if (salario <= 1045.00){
            inss = salario * 0.075;
            System.out.println("INSS até R$1045,00 = " + inss);}
        if (salario >= 1045.01 && salario <= 2089.60){
            inss = salario * 0.09;
            System.out.println("INSS de R$1045,01 até R$2089,60 = " + inss);}
        if (salario >= 2089.61 && salario <= 3134.40){
            inss = salario * 0.12;
            System.out.println("INSS de R$2089,61 até R$3134,40 = " + inss);}
        if (salario >= 3134.41 && salario <= 6101.06){
            inss = salario * 0.14;
            System.out.println("INSS de R$3134,41 até R$6101,06 = " + inss);}

    }

    }

