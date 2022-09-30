package exercicios_easy;
//Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
//Respeitando a tabela abaixo:

import javax.swing.*;

public class Exec8 {
    public static double calcularImpostoDeRenda(double salarioBruto) {

        double salarioLiquido =0.0 , IR = 0;

        if (salarioBruto <= 1903.98) {
            IR = 0;
        }
        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            IR = (salarioBruto * 0.075) - 142.80;
        }
        if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            IR = (salarioBruto * 0.15) - 354.8;
        }
        if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            IR = (salarioBruto * 0.225) - 636.13;
        }
        if (salarioBruto > 4664.68) {
            IR = (salarioBruto * 0.275) - 869.36;

        }
        return IR;
    }
    public static double calcularSalarioLiquido(double salario,double impostoDeRenda){
        return salario - impostoDeRenda;

    }
}




