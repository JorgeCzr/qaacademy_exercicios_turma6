package testes_unitarios_junit;

import exercicios_easy.Exec7;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exec7EasyTest {

    @Test
    public void testCalcularSalarioInss1() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 78.375;
        double valorAtual = Exec7.calcularSalarioInss(1045.00);
        assertEquals(valorEsperado, valorAtual, 3);
    }

    @Test
    public void testCalcularSalarioInss2() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 94.05;
        double valorAtual = Exec7.calcularSalarioInss(1045.01);
        assertEquals(valorEsperado, valorAtual, 3);

    }

    @Test
    public void testCalcularSalarioInss3() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 250.7532;
        double valorAtual = Exec7.calcularSalarioInss(2089.61);
        assertEquals(valorEsperado, valorAtual, 3);
    }

    @Test
    public void testCalcularSalarioInss4() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 438.8174;
        double valorAtual = Exec7.calcularSalarioInss(3134.41);
        assertEquals(valorEsperado, valorAtual, 3);
    }

    @Test
    public void testCalcularSalarioInss5() {
        Exec7 exec7 = new Exec7();
        Double valorEsperado = 854.15;
        double valorAtual = Exec7.calcularSalarioInss(6101.06);
        assertEquals(valorEsperado, valorAtual, 3);

    }
}
