package exemplos;

public class ExercicioMetodoComParametro {

    public static void main(String[] args) {
        //Com Retorno
        System.out.println(exibirNomeEIdade("JORGE" + " - ", 38));
        System.out.println(retornarPalavra("Teste"));
        System.out.println(retornarDobro(10));
        System.out.println(retornarNomeSobrenome("Jorge" , "Augusto"));
        System.out.println(salario("Jorge"));

        //Sem Retorno
        exibirNomeEIdadeSemRetorno("JORGE" + " - ", 38);
        retornarPalavraSemRetorno("Teste");
        retornarDobroSemRetorno(10);
        retornarNomeSobrenomeSemRetorno("Jorge" , "Augusto");
        salarioSemRetorno("Jorge");

    }

    //Parametro com retorno
    public static String exibirNomeEIdade(String nome, int idade) {
        return "Nome : " + nome + "Idade : " + idade;
    }

    public static String retornarPalavra(String palavra) {
        return palavra;
    }

    public static int retornarDobro(int numero) {
        return numero * 2;
    }

    public static String retornarNomeSobrenome(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }

    public static double salario(String nome) {
        return 20.00000;
    }




    //Parametro sem retorno

    public static void exibirNomeEIdadeSemRetorno(String nome, int idade) {
        System.out.println("Nome : " + nome + "Idade : " + idade);;
    }

    public static void retornarPalavraSemRetorno(String palavra) {
        System.out.println(palavra);
    }

    public static void retornarDobroSemRetorno(int numero) {
        System.out.println(numero * 2);
    }

    public static void retornarNomeSobrenomeSemRetorno(String nome, String sobrenome) {
        System.out.println(nome + " " + sobrenome);
    }

    public static void salarioSemRetorno(String nome) {
        System.out.println(20.000);
    }

}
