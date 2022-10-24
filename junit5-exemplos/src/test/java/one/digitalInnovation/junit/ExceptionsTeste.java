package one.digitalInnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validaCenarioDeExcessaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0.0);
        Conta contaDestino = new Conta("456123", 100.0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(()->transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
