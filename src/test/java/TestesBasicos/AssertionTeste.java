package TestesBasicos;

import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionTeste {

    @Test
    void validadeLancamento (){
        int [] lance1 = {10,20,5,6,7};
        int [] lance2 = {10,20,5,6,7};

        Assertions.assertArrayEquals(lance2,lance1);

    }

    @Test
    void validadeSeObjetoeNulo (){

        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Fernando", LocalDateTime.now());
    Assertions.assertNotNull(pessoa);
    }

    @Test

    void validarNumerosTiposDiferentes(){

        Double num1 = 5.15;
        Double num2 = 5.15;

        Assertions.assertEquals(num1,num2);

    }

}
