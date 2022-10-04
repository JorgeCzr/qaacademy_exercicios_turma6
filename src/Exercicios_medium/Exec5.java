package Exercicios_medium;

import javax.swing.*;

////Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.
public class Exec5 {
    public void verificarMenorNum() {
        int numeroDigitado, menorNumero = 0, i = 1;

        while (i <= 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
            if (numeroDigitado < menorNumero || i ==1){
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O Numero: " + menorNumero + " é o menor.");
    }
}


