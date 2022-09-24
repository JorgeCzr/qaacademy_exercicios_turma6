package main;

import exemplos.MetodoSemMain;

public class Execucao {
    public static void main(String[] args) {
        MetodoSemMain Metodo = new MetodoSemMain();

        //Void
        Metodo.printarcores();

        //Parametro
        System.out.println(Metodo.pais("Penta"));

        //Return sem Parametro
        System.out.println(Metodo.corinthians());

    }
}
