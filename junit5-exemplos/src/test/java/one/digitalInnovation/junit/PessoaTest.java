package one.digitalInnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class PessoaTest {

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa joao = new Pessoa("Joãozinho", LocalDate.of(2020, 1, 1).atStartOfDay());
        Assertions.assertFalse(joao.ehMaiorDeIdade());

        Pessoa marta = new Pessoa("Marta", LocalDate.of(1995,1,15).atStartOfDay());
        Assertions.assertTrue(marta.ehMaiorDeIdade());

        List<Pessoa> pessoas = List.of(new Pessoa("Julia", LocalDateTime.now()), new Pessoa("Maria", LocalDateTime.now()));
        Assertions.assertAll("pessoas",
                ()-> Assertions.assertFalse(pessoas.get(0).ehMaiorDeIdade()),
                ()-> Assertions.assertFalse(pessoas.get(1).ehMaiorDeIdade())
        );
    }

    @Test
    void deveRetornarIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000,1,1,15,0,0));
        Assertions.assertEquals(22,jessica.getIdade());
    }
}
