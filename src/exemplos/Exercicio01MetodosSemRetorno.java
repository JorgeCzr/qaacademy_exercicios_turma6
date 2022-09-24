package exemplos;

// Introdução a Linguagem Java parte II Exercicios;
// 1-Criar uma Classe
// 2-Criar 5 Metodos sem retorno
// 3-Adicionar uma instrução para exibir o nome do metodo
// 4-fazer a chamada destes 5 metodos em um main

public class Exercicio01MetodosSemRetorno {
    //metodo main
    public static void main(String[] args) {
        corinthians();
        flamengo();
        palmeiras();
        santos();
        saoPaulo();
    }

    //metodo void sem retorno
    public static void corinthians() {
        System.out.println("Gaviões");

    }

    public static void flamengo() {
        System.out.println("urubu");
    }

    public static void palmeiras() {
        System.out.println("Peppa");
    }

    public static void santos() {
        System.out.println("Sereia");
    }

    public static void saoPaulo() {
        System.out.println("bambi");
    }
}




