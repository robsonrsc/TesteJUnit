import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ClassificandoPorOrdem {
    @Order(4)
    @Test
    void ValidaTesteA(){

        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void ValidaTesteB(){
        Assertions.assertTrue(true);

    }
    @Order(2)
    @Test
    void ValidaTesteC(){
        Assertions.assertTrue(true);

    }
    @Order(1)
    @Test
    void ValidaTesteD(){
        Assertions.assertTrue(true);

    }
}
