package exercicios_easy;

//Faça um algoritmo para ler um número inteiro entre: 1 a 10,
//calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 =
//100.

import javax.swing.*;

public class Exec9 {
    public static void calcularTabuada(int numeroDigitado){
        int i =1 , resultado;

       while (i<=10) {
           resultado = numeroDigitado * i;
           System.out.println(numeroDigitado + " X " + i + " = " + resultado);
           i++;
       }
       }

    }

//           int num=10 , i=1;
//           while (i<=10) {
//           System.out.println("Tabuada do 10 = " + num * i);
//           i = i + 1; ou i++;