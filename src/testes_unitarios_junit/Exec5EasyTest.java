package testes_unitarios_junit;
import exercicios_easy.Exec5E1;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exec5EasyTest {
    static Exec5E1 exec5E1;

    @BeforeClass
    public static void beforeClass() {
       exec5E1 = new Exec5E1();
    }

    @Test
    public void testExibirSoma() {
        int soma = exec5E1.exibirSoma(2, 2, 2);
        assertEquals(6, soma);

    }

    @Test
    public void testExibirsubtracao() {
        int subtracao = exec5E1.exibirSubtracao(50, 30, 10);
        assertEquals(10, subtracao);
    }

    @Test
    public void testExibirMultiplicacao() {
        int multiplicacao = exec5E1.exibirMultiplicação(2, 2, 2);
        assertEquals(8, multiplicacao);
    }

    @Test
    public void testExibirMedia() {
        int valorEsperado = exec5E1.exibirMedia(6);
        int valorMedia = 2;
        assertEquals(valorEsperado, valorMedia);

    }
}
