package Treinamento;
//Descobrir idade
import javax.swing.*;

public class Treinamento {
    public static void main(String[] args) {
        int anoNascimento,anoAtual,idadeAtual;
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de Nascimento"));
        anoAtual = 2022;
        idadeAtual = anoAtual - anoNascimento;
        System.out.println("Sua idade é:" + idadeAtual);

    }
}
