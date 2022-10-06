package testes_unitarios_junit;

import exercicios_easy.Exec5E1;
import exercicios_easy.Exec6;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exec6EasyTest {
    static Exec6 exec6;

    @BeforeClass
    public static void beforeClass() {
        exec6 = new Exec6();
    }

    @Test
    public void testVerficarNotaAprovado() {
        String aprovado = Exec6.verificaAprovacao(7, 8);
        assertEquals("Voce foi Aprovado , Parabens!!! ", aprovado);

    }

    @Test
    public void testVerficarNotaReprovado() {
        String mensagemEsperada = "Você foi Reprovado! ";
        String mensagemAtual = Exec6.verificaAprovacao(5, 2);
        assertEquals(mensagemEsperada, mensagemAtual);

    }

    @Test
    public void testVerficarNotaExame() {
        assertEquals("Você esta de Exame! ", Exec6.verificaAprovacao(5, 5));

    }
}
