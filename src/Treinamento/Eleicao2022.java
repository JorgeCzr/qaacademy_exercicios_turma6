package Treinamento;
// Comandos Subir projeto Github : git add . / git commit -m "texto" / git push
// git status - Lista todos os arquivos novos ou modificados para serem commitadosgit status
import javax.swing.*;

public class Eleicao2022 {
    public static void main(String[] args) {
        int voto = 0, voto1 = 0, voto2 = 0;
        voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Voto para Presidente "));
        if (voto == 22) {

            System.out.println("Você votou no Presidente : Jair Bolssonaro ");
            JOptionPane.showMessageDialog(null, "Você votou no Presidente : JAIR BOLSONARO ");
        }else


        if (voto == 13) {

            System.out.println(" Você votou no Ex Presidiario LUIZ INÁCIO LULA DA SILVA , mais conhecido como : LULADRÂO ");
            JOptionPane.showMessageDialog(null, "Você votou no Ex Presidiario LUIZ INÁCIO LULA DA SILVA , mais conhecido como : LULADRÂO ");

        }else {

            System.out.println("Não adianta inventar moda seu PIPOQUEIRO ! Não jogue seu voto no LIXO.");
            JOptionPane.showMessageDialog(null, "Não adianta inventar moda seu PIPOQUEIRO ! Não jogue seu voto no LIXO.");
        }
    }
}






