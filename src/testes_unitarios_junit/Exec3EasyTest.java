package testes_unitarios_junit;

import exercicios_easy.Exec3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exec3EasyTest {

    @Test
    public void TestValoresTrocados() {
        Exec3 exec3 = new Exec3();
        String mensagemEsperada = "Estado : segundoValor -  Cidade : primeiroValor";
        String mensagemAtual = Exec3.exibirDoisValoresTrocados("primeiroValor", "segundoValor");
        assertEquals(mensagemEsperada, mensagemAtual);
    }

}
