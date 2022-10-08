package testes_unitarios_junit;

import exercicios_easy.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exec2EasyTest {

    @Test
    public void testDeJuncaoPalavra() {
        Exec2 exec2 = new Exec2();
        String mensagemEsperada =  " A Palavra é : palavra ";
        String mensagemAtual = Exec2.lerEExibirPalavra("palavra ");
        assertEquals(mensagemEsperada,mensagemAtual);

    }

}

//Sem retorno , por isso não foi necessario o assertEquals






