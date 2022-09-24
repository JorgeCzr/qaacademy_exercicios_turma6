package exercicios_easy;
//Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
//Respeitando a tabela abaixo:

import javax.swing.*;

public class Exec8 {
    public static void main(String[] args) {
        double salarioBruto=0, IR=0, salarioLiquido=0;

        salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Bruto "));
        if (salarioBruto <= 1903.98) {
            IR = 0;
            salarioLiquido = salarioBruto - IR;

        }

        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            IR = salarioBruto * 0.075;
            salarioLiquido = salarioBruto - IR;

        }

        if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            IR = salarioBruto * 0.15;
            salarioLiquido = salarioBruto - IR;

        }

        if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            IR = salarioBruto * 0.225;
            salarioLiquido = salarioBruto - IR;

        }

        if (salarioBruto > 4664.68) {
            IR = salarioBruto * 0.275;
            salarioLiquido = salarioBruto - IR;

        }

            System.out.println("Salário Bruto = " + salarioBruto);
            System.out.println("IR = " + IR);
            System.out.println("Salário Liquido = " + salarioLiquido);
        }
    }




