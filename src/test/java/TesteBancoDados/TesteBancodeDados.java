package TesteBancoDados;

import org.example.BancoDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class TesteBancodeDados {


    @BeforeAll
    static void configuraConnexao(){

        BancoDados.iniciarConexao();
        System.out.println("Entrou na classe e inicou conexao");
    }

    @BeforeEach
    void testeInserirInformacoes (){

        BancoDados.Inserirdados(new Pessoa("joao", LocalDateTime.of(1980,03,04,2,30,00)));
    }
    @AfterEach
     void testeRemoverInformacoes (){

        BancoDados.removerdados(new Pessoa("joao", LocalDateTime.of(1980,03,04,2,30,00)));
    }

    @Test
     void ValidarDadosdeRetorno(){

        Assertions.assertTrue(true);
    }

    @AfterAll
     static  void FinalizaCOnexao(){

        BancoDados.finalizarConexao();
        System.out.println("finalizou conexao");
    }
}
