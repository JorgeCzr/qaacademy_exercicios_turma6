package Exercicios_medium;

import javax.swing.*;

//Faça um algoritmo que :
//
//
//- Calcule e exiba a sequência de
//Fibonacci até o 10º elemento.
//
//
//Ex.: 0, 1,1 .. 34. Usando Vetor, para
//armazenar o resultado.
//
//
//A sequência de Fibonacci, é calculada
//com a soma dos 2 termos anteriores, sendo o primeiro e o segundo, 0 e 1,
//respectivamente.
//
//
// 0, 1, 1, 2, 3, 5, 8, ..
public class Exec10 {
    public void sequenciaFibonacci () {

        int elemento = 10;
        int[] fibonacci;
        fibonacci = new int[elemento];
        int i = 2;
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        i = 0;
        while (i < elemento) {
            System.out.println("Termo : " + (i+1) + " - valor : " + fibonacci[i]);
            i++;
        }

    }
}
