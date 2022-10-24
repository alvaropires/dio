package one.digitalInnovation.junit;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    @DisplayName("A")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    @DisplayName("D")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
