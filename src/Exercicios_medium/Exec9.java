package Exercicios_medium;

import javax.swing.*;

//Faça um algoritmo para:
//Criar dois vetores.
//Em um vetor: ler e armazenar o nomes de
//alunos.
//No outro vetor: ler e armazenar a numeração
//de cada aluno, de acordo com a ordem inserida no vetor de nomes.
//E exiba, o Nome e o número correspondente de
//cada um.
public class Exec9 {
    public static void main(String[] args) {
        String[] alunoVetor = new String[5];
        int[] numeroAlunoVetor = new int[5];
        int i = 0;

        while (i < 5) {
            alunoVetor[i] = JOptionPane.showInputDialog("Digite o nome do Aluno");
            numeroAlunoVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Aluno"));
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println("Nome do Aluno : " + alunoVetor[i] + " - " + " Numero do Aluno : " + numeroAlunoVetor[i]);
            i++;
        }


    }
}
