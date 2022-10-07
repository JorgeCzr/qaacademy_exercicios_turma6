package testes_unitarios_junit;

import exercicios_easy.Exec6;
import exercicios_easy.Exec7;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class Exec7EasyTest {

    static Exec7 exec7;
    static DecimalFormat df;

    @BeforeClass
    public static void beforeClass() {
        exec7 = new Exec7();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void testCalcularSalarioInss1() {
        String valorEsperado = "78,375";
        String valorAtual = df.format(Exec7.calcularSalarioInss(1045.00));

        assertEquals("Valor diferente do esperado", valorAtual, valorAtual);
    }

    @Test
    public void testCalcularSalarioInss2() {
        String valorEsperado = "94,05";
        String valorAtual = df.format(Exec7.calcularSalarioInss(1045.01));

        assertEquals("Valor diferente do esperado", valorAtual, valorAtual);
    }

    @Test
    public void testCalcularSalarioInss3() {
        String valorEsperado = "250,7532";
        String valorAtual = df.format(Exec7.calcularSalarioInss(2089.61));

        assertEquals("Valor diferente do esperado", valorAtual, valorAtual);
    }

    @Test
    public void testCalcularSalarioInss4() {
        String valorEsperado = "438,8174";
        String valorAtual = df.format(Exec7.calcularSalarioInss(3134.41));

        assertEquals("Valor diferente do esperado", valorAtual, valorAtual);
    }

    @Test
    public void testCalcularSalarioInss5() {
        String valorEsperado = "854,15";
        String valorAtual = df.format(Exec7.calcularSalarioInss(6101.06));

        assertEquals("Valor diferente do esperado", valorAtual, valorAtual);
    }
}
