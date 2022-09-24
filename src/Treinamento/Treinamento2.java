package Treinamento;
//Descobrir idade atual
import javax.swing.*;

public class Treinamento2 {
    public static void main(String[] args) {
        int anoNascimento,anoAtual = 2022,idadeAtual;
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de Nascimento"));
        idadeAtual = anoAtual - anoNascimento;
        System.out.println("Sua idade é:" + idadeAtual);
    }
}
