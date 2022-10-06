package testes_unitarios_junit;

import exercicios_easy.Exec4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exec4EasyTest {

    @Test
    public void testDobro() {
        Exec4 exec4 = new Exec4();
        int valorEsperado = 20;
        int valorAtual = Exec4.calculaDobroNumeroInt(10);
        assertEquals(valorEsperado, valorAtual);
    }
}
