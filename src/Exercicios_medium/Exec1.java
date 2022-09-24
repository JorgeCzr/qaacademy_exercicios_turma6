package Exercicios_medium;
//Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
//números Pares e ímpares.

//Esse exercicios vai trabalhar com o resto da divisão ,se o resto da divisão for = 0 é numero par, se for for dirente de 0 ´igual a impar

//Outro Ex: de como funciona o Operador Modulo %
//double num1 = 9;
//double num2 = 2;
//double res = num1 / num2
//double resto = num1 % num2
//System.out.println(num1 + "dividido por" + num2 + " = " + res);
//System.out.println("O resto da divisao e: " + resto);

public class Exec1 {
    public  void exibirParImpar() {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("O Numero = " + i + " é Par");
            } else {
                System.out.println("O Numero = " + i + " é Impar");
            }
            i++;

        }

    }
}
