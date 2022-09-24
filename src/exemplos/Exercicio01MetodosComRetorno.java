package exemplos;

public class Exercicio01MetodosComRetorno {
    //metodo main
    public static void main(String[] args) {
        System.out.println(saoPauloCidade());
        System.out.println("Cep - " + cep());
        System.out.println("Barueri é uma cidade prospera - " + cidadeProspera());
        System.out.println("População - " + populacao());
        System.out.println("Nome do Prefeito de Barueri - " + prefeito());


    }

    //metodo com retorno
    public static String saoPauloCidade() {
        return "Barueri";
    }

    public static int cep() {
        return 6401160;
    }

    public static boolean cidadeProspera() {
        return true;
    }

    public static double populacao() {
        return 279.704;
    }

    public static String prefeito() {
        String mensagem = "Rubens Furlan";
        return mensagem;
    }
}



