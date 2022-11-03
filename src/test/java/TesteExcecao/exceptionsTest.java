package TesteExcecao;

import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class exceptionsTest {

    @Test
    void ValidarCenarioExcecaoNaTransferencia(){

        Conta contaOrigem = new Conta("123456",0);
        Conta contaDestino = new Conta("456548",100);


        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> transferenciaEntreContas.transferenciaEntreContas(contaOrigem,contaDestino,-1));


    }
}
