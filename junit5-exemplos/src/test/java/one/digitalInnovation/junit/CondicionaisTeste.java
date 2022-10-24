package one.digitalInnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
//    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
//    @EnabledOnOs(OS.LINUX)
//    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    @EnabledOnJre(JRE.JAVA_17)
        void validarAgoSomenteNoUsuarioAlvaro(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
