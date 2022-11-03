package org.example;

import java.util.logging.Logger;

public class BancoDados {

    private final static Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao(){

        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){

        LOGGER.info("Finalizou conexao");
    }

    public static void Inserirdados (Pessoa pessoa){
        LOGGER.info("Inseriu informacoes");
    }
    public static void removerdados (Pessoa pessoa){
        LOGGER.info("Removeu informacoes");
    }


}
