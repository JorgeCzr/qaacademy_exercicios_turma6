package exercicios_easy;
//Faça um algoritmo para ler três números inteiros, armazenar em variáveis,
// e exibir a soma, a subtração, multiplicação e a média dos três números digitados
import javax.swing.*;

public class Exec5E2 {
    public static void main(String[] args) {
    int soma,subtracao,multiplicacao,media,num1,num2,num3;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    soma = num1 + num2 + num3;
    subtracao = num1-num2-num3;
    multiplicacao = num1*num2*num3;
    media =soma/3;
        System.out.println("A soma dos numeros é:" + soma);
        System.out.println("A subtração dos numeros é:" + subtracao);
        System.out.println("A multiplicação dos numeros é:" +  multiplicacao);
        System.out.println("A media dos numeros é:" + media);
    }
}
