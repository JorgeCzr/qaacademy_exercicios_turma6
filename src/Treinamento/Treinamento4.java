package Treinamento;

import javax.swing.*;
//Calculo de dizimo em cima do salario bruto
public class Treinamento4 {
    public static void main(String[] args) {
        int salarioBruto,porcentagem,dizimo,salarioSemdizimo;
        salarioBruto= Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario"));
        porcentagem = 10 * salarioBruto;
        dizimo = porcentagem / 100;
        salarioSemdizimo = salarioBruto - dizimo;
        System.out.println("Seu dizimo é = " + dizimo);
        JOptionPane.showMessageDialog(null,"Seu dizimo é = R$ " + dizimo);
        System.out.println("Salario liquido após dizimar é = " + salarioSemdizimo);
        JOptionPane.showMessageDialog(null,"Salario liquido após dizimar é = R$ " + salarioSemdizimo);


    }
}
