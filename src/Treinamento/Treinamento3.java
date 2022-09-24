package Treinamento;
//Taxa de matricula
import javax.swing.*;

public class Treinamento3 {
    public static void main(String[] args) {
        int rendaMensal,pagarTaxa = 50,insento = 0;
        rendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite sua renda"));
        if (rendaMensal >=5000)
        System.out.println("Sua Taxa é = " + pagarTaxa );
       if (rendaMensal <5000)
           System.out.println("Sua Taxa é = " + insento);

    }
}
