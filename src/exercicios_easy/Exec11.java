package exercicios_easy;
//Faça um algoritmo para ler um número inteiro, somar 2 ao número
//digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
//completar 100 iterações.

import javax.swing.*;

public class Exec11 {
    public static int somaDois(int numeroDigitado) {
        int i = 1;

        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            i++;
        }
        return numeroDigitado;

    }
}

