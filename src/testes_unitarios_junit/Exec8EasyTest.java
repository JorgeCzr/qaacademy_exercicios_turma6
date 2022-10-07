package testes_unitarios_junit;

import exercicios_easy.Exec7;
import exercicios_easy.Exec8;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class Exec8EasyTest {

    static Exec8 exec8;
    static DecimalFormat df;

    @BeforeClass
    public static void beforeClass() {
        exec8 = new Exec8();
        df = new DecimalFormat("#,###.00");

    }

    @Test
    public void testCalcularIr1 (){
        String valorEsperado = "0,00";
        String valorAtual = df.format(Exec8.calcularImpostoDeRenda(1903.98));

        assertEquals("Valor diferente do esperado", valorAtual, valorAtual);
    }

//    @Test
//    public void testCalcularIr2 (){
//        String valorEsperado = "0,00925";
//        String valorAtual = df.format(Exec8.calcularImpostoDeRenda(1903.99));
//
//        assertEquals("Valor diferente do esperado", valorAtual, valorAtual);

}




