package Exercicios_medium;

import javax.swing.*;

//Faça um algoritmo para calcular e exibir a multiplicação de todos os números de 1 a 1000. E toda vez que resultado
//chegar ou ultrapassar 1000, faça que o resultado das multiplicações volte a ser 1.
public class Exec4 {
    public static void main(String[] args) {
        int i = 1, resultadoMultiplicação = 1;

        while (i <= 1000) {
            resultadoMultiplicação = resultadoMultiplicação * i;
            System.out.println("O Resultado da multiplicação é " + resultadoMultiplicação);
            if (resultadoMultiplicação >= 1000) {
                resultadoMultiplicação = 1;
            }
            i++;
        }
    }

}

