package Exercicios_medium;

//Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.
public class Exec7_8 {
    public String[] criarVetorMeses() {
        //Exercicio 7
        String[] vetorMeses;
        vetorMeses = new String[12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

       return vetorMeses;
    }

    //Faça um algoritmo para exibir todos os meses digitados anteriormente.
    //Exercicio 8
    public void imprimeValoresVetor(String[] vetorMeses) {
        int i = 0;
        while (i < 12) {
            System.out.println("O Mês: " + (i + 1) + "-" + vetorMeses[i]);
            i++;
        }
    }
}
