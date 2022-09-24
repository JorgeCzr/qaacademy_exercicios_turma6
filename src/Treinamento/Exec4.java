package Treinamento;
//Faça um algoritmo para ler um número inteiro,
//armazenar em uma variável, calcular o dobro, e exibir

import javax.swing.*;

public class Exec4 {
    public static void main(String[] args) {
        //Declarar variável do tipo numérico : num1, result;
   int num1,result;
   //num1 = Ler(6);
   num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
   //          result= num1*2;
        result = num1*2;
        //        Exibir: " O Dobro é: + result;"
        System.out.println("O Dobro é:" + result);

    }

}

//Inicio Algoritmo
//    Declarar variável do tipo numérico : num1, result;
//    num1 =  Ler(6);
//    result= num1*2;
//    Exibir: “O dobro é: ” + result;
//Fim Algoritmo
