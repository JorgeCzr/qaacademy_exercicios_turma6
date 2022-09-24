package exercicios_easy;
//Faça um algoritmo para ler três números inteiros, armazenar em variáveis,
// e exibir a soma, a subtração, multiplicação e a média dos três números digitados

public class Exec5E1 {
    public static void main(String[] args) {
      int num1,num2,num3,soma,subtração,multiplicação,media;
        num1 = 10;
        num2 = 20;
        num3 = 30;
        soma = num1+num2+num3;
       subtração = num1-num2-num3;
       multiplicação =num1-num2-num3;
       media = soma/3;
       System.out.println("A soma dos números digitados é:" + soma);
       System.out.println("A subtração dos números digitados é:"+ subtração);
       System.out.println("A multiplicaçaõ dos números digitados é:"+ multiplicação);
       System.out.println("A média dos números digitados é:"+ media);

    }
}
