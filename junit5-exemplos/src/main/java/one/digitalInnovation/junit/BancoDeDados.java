package one.digitalInnovation.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());



    public static void iniciarConexao(){
//        faz algo
    LOGGER.info("Iniciou conexão");
    }

    public static void finalizaConexao(){
//        faz algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa){
//        Insere pessoa no DB
        LOGGER.info("Inseriu dados.");
    }

    public static void removeDados(Pessoa pessoa){
//        Remove uma pessoa no DB
        LOGGER.info("Removeu dados.");
    }

}
