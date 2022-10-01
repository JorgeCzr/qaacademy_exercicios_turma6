package testes;

import exercicios_easy.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecEasyTest {

    @Test
    public void testDeJuncaoPalavra() {
        Exec2 exec2 = new Exec2();
        Exec2.lerEExibirPalavra("Bolsonaro");
        assertEquals(" A Palavra é : Bolsonaro", Exec2.lerEExibirPalavra("Bolsonaro"));

    }

//    @Test
//    public void exibirDoisValoresTrocados() {
//        Exec3 exec3 = new Exec3();




    @Test
    public void testeDobro() {
        Exec4 exec4 = new Exec4();
        int dobro = Exec4.calculaDobroNumeroInt(10);
        assertEquals(20, dobro);
    }

    @Test
    public void exibirSoma() {
        Exec5E1 exec5E1 = new Exec5E1();
        int soma = exec5E1.exibirSoma(2, 2, 2);
        assertEquals(6, 6);

    }

    @Test
    public void exibirsubtraçao() {
        Exec5E1 exec5E1 = new Exec5E1();
        int subtracao = exec5E1.exibirSubtracao(50, 30, 10);
        assertEquals(10, 10);

    }

    @Test
    public void exibirMultiplicacao() {
        Exec5E1 exec5E1 = new Exec5E1();
        int multiplicacao = exec5E1.exibirMultiplicação(2, 2, 2);
        assertEquals(8, 8);
    }

    @Test
    public void exibirMedia() {
        Exec5E1 exec5E1 = new Exec5E1();
        int media = exec5E1.exibirMedia(6);
        assertEquals(2, 2);

    }

    @Test
    public void verficarNota (){
        Exec5E1 exec5E1 =new Exec5E1();
        assertEquals("Voce foi Aprovado , Parabens!!! ",Exec6.verificaAprovacao(8,9));
    }
}

