package testes_unitarios_junit;

import exercicios_easy.Exec9;
import org.junit.BeforeClass;
import org.junit.Test;

public class Exec9EasyTest {

    static Exec9 exec9;

    @BeforeClass
    public static void beforeclass(){
        exec9 = new Exec9();
        }

        @Test
        public void testeTabuada(){
        Exec9.calcularTabuada(10);

    }
}
