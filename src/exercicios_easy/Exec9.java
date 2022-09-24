package exercicios_easy;

//Faça um algoritmo para ler um número inteiro entre: 1 a 10,
//calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 =
//100.

import javax.swing.*;

public class Exec9 {
    public static void main(String[] args) {
        int num=0, i =1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
       while (i<=10) {
           System.out.println(num + " X " + i + " = " + num * i);
           i++;
       }
       }

    }

//           int num=10 , i=1;
//           while (i<=10) {
//           System.out.println("Tabuada do 10 = " + num * i);
//           i = i + 1; ou i++;