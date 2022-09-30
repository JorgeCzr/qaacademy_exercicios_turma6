package exercicios_easy;
//Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame.
import javax.swing.*;

public class Exec6 {

    public static String verificaAprovacao(double nota1, double nota2) {
        double resultado;
        resultado = (nota1 + nota2) / 2;

        if (resultado > 5) {
            return "Você foi Aprovado , Parabéns!!! ";
        }
        if (resultado < 5) {
            return "Você foi Reprovado! ";
        }
        if (resultado == 5) {
            return "Você esta de Exame! ";
        }
        return "Não foi possivel calcular sua nota";
    }

}




//    int nota1;
//    int nota2;
//    int media = (nota1 + nota2) / 2;
//
//    public int primeiraNota(int nota1 {
//        return nota1;
//
//    }
//
//    public int segundaNota(int nota2) {
//        return nota2;
//    }
//
//    public int mediaNota(int media){
//      if (media>5)
//        return media;
//    }
//}
//







    //}
//}
//    public static void main(String[] args) {
//        int nota1,nota2,media;
//        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota"));
//        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota"));
//        media = (nota1 + nota2) / 2;
//        if (media > 5)
//        {System.out.println("Aprovado");}
//        if (media < 5)
//        {System.out.println("Reprovado");}
//        if (media == 5)
//        {System.out.println("Exame");}
//    }
//}
