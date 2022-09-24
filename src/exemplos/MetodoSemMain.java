package exemplos;

public class MetodoSemMain {

    //Variaveis
    String nome = "jorge";
    String sobrenome = "augusto";

    //Void
    public void printarcores() {
        System.out.println("Azul e Amarelo");
    }

    //Parametro
    public String pais(String brasil) {
        return brasil;
    }

    //Return sem Parametro
    public String corinthians() {
        return "corinthians";

    }

    public static class MetodosComParametrosMain {

        public static void main(String[] args) {
            sub(2022, 2009);
            texto1(" Jorge ", " Augusto ");
            texto2(" Carol ", " Cezar ");
            texto3(" Alice ", " Martins ");
            texto4(" Guilherme ", " Cezar ");

        }

        public static void sub(int num1, int num2) {
            System.out.println("Esta Familia tem: " + (num1 - num2) + " Anos de História");
        }


        public static void texto1(String a, String b) {
            System.out.println("meu nome é : " + a + b);

        }

        public static void texto2(String a, String b) {
            System.out.println("meu nome é : " + a + b);
        }

        public static void texto3(String a, String b) {
            System.out.println("meu nome é : " + a + b);
        }

        public static void texto4(String a, String b) {
            System.out.println("meu nome é : " + a + b);

        }
    }
}



