package testes;

import exercicios_easy.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecEasyTest {

    //Exec2
    @Test
    public void testDeJuncaoPalavra() {
        Exec2 exec2 = new Exec2();
        // Exec2.lerEExibirPalavra("Bolsonaro");
        assertEquals(" A Palavra é : Bolsonaro", Exec2.lerEExibirPalavra("Bolsonaro"));
    }

    //Exec3
    @Test
    public void TestValoresTrocados() {
        Exec3 exec3 = new Exec3();
        String mensagemEsperada = "Estado : segundoValor -  Cidade : primeiroValor";
        String mensagemAtual = Exec3.exibirDoisValoresTrocados("primeiroValor", "segundoValor");
        assertEquals(mensagemEsperada, mensagemAtual);

    }

    //Exec4
    @Test
    public void testeDobro() {
        Exec4 exec4 = new Exec4();
        int valorEsperado = 20;
        int valorAtual = Exec4.calculaDobroNumeroInt(10);
        assertEquals(valorEsperado, valorAtual);
    }

    //Exec5
    @Test
    public void exibirSoma() {
        Exec5E1 exec5E1 = new Exec5E1();
        int soma = exec5E1.exibirSoma(2, 2, 2);
        assertEquals(6, soma);

    }

    @Test
    public void exibirsubtraçao() {
        Exec5E1 exec5E1 = new Exec5E1();
        assertEquals(10, exec5E1.exibirSubtracao(50, 30, 10));

    }

    @Test
    public void exibirMultiplicacao() {
        Exec5E1 exec5E1 = new Exec5E1();
        int multiplicacao = exec5E1.exibirMultiplicação(2, 2, 2);
        assertEquals(8, multiplicacao);
    }

    @Test
    public void exibirMedia() {
        Exec5E1 exec5E1 = new Exec5E1();
        int media = exec5E1.exibirMedia(6);
        assertEquals(2, media);

    }

    //Exec6
    @Test
    public void verficarNotaAprovado() {
        Exec6 exec6 = new Exec6();
        String aprovado = Exec6.verificaAprovacao(7, 8);
        assertEquals("Voce foi Aprovado , Parabens!!! ", aprovado);

    }

    @Test
    public void verficarNotaReprovado() {
        Exec6 exec6 = new Exec6();
        String mensagemEsperada = "Você foi Reprovado! ";
        String mensagemAtual = Exec6.verificaAprovacao(5, 2);
        assertEquals(mensagemEsperada, mensagemAtual);

    }

    @Test
    public void verficarNotaExame() {
        Exec5E1 exec5E1 = new Exec5E1();
        assertEquals("Você esta de Exame! ", Exec6.verificaAprovacao(5, 5));

    }

    //Exec7

    @Test
    public void testeCalcularSalarioInss1() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 78.375;
        double valorAtual = Exec7.calcularSalarioInss(1045.00);
        assertEquals(valorEsperado, valorAtual, 3);
    }

    @Test
    public void testeCalcularSalarioInss2() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 94.05;
        double valorAtual = Exec7.calcularSalarioInss(1045.01);
        assertEquals(valorEsperado, valorAtual, 3);

    }

    @Test
    public void testeCalcularSalarioInss3() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 250.7532;
        double valorAtual = Exec7.calcularSalarioInss(2089.61);
        assertEquals(valorEsperado, valorAtual, 3);
    }

    @Test
    public void testeCalcularSalarioInss4() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 438.8174;
        double valorAtual = Exec7.calcularSalarioInss(3134.41);
        assertEquals(valorEsperado, valorAtual, 3);
    }

    @Test
    public void testeCalcularSalarioInss5() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 854.15;
        double valorAtual = Exec7.calcularSalarioInss(6101.06);
        assertEquals(valorEsperado, valorAtual, 3);

    }

    //Exec7/8
}







