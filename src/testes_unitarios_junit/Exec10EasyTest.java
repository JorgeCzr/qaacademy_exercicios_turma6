package testes_unitarios_junit;

import exercicios_easy.Exec10ex2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Exec10EasyTest {

    @Test
    public void TestcalcularValorInvestimento(){
        Exec10ex2 exec10ex2 = new Exec10ex2();
        String valorAtual = exec10ex2.calcularValorInvestimento(1000);
        String esperado = "Valor dos juros = " + 500.0 + " - Valor investimento = " + 1000.0 + " - Valor total = " + 1500.00;
        assertEquals(esperado,valorAtual);






    }
}
