package testes_unitarios_junit;

import exercicios_easy.Exec11;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Exec11EasyTest {

    @Test
    public void testeSoma2(){
        Exec11EasyTest exec11EasyTest = new Exec11EasyTest();
       int valorAtual = Exec11.somaDois(10);
       assertEquals(210,valorAtual);



    }
}
