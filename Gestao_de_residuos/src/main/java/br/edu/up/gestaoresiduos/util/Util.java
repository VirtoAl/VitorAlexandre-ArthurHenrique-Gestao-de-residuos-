package br.edu.up.gestaoresiduos.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    private static final Logger logger = LogManager.getLogger(Util.class);

    public static int lerInteiro(Scanner scanner){
        String resposta = scanner.nextLine();
        try{
            int n = Integer.parseInt(resposta);
            logger.info("Número inteiro comprovado!");
            return n;
        } catch (NumberFormatException ex){
            logger.error(resposta + " infelizmente, não é um número inteiro", ex);
            return 0;
        }
    }

    public static void erro(String mensagem){
        logger.error(mensagem);
    }

}
