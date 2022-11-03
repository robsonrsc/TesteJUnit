package Assumptions;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class TesteAssumption {

    @Test
    @EnabledIfEnvironmentVariable(named = "user",matches = "robson")

    void ValidarCondicional() {

        //Assumptions.assumeFalse("robson".equals(System.getenv("user")));
        Assertions.assertEquals(10,5+5);

    }
 /*   @AfterAll

    void ValidarCondiciona2l() {

        //Assumptions.assumeFalse("robson".equals(System.getenv("user")));
        Assertions.assertEquals(10,5+5);

    }*/

}