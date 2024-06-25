package br.edu.up.dados.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
     private static final Logger logger = LogManager.getLogger(Util.class);

public static int lerInteiro(Scanner scanner){
    try{
        int n = scanner.nextInt();
        logger.info("Número inteiro comprovado!");
        if(n != 1 && n != 2){
            logger.info("Número inteiro inválido");
        }
        return n;
    } catch (InputMismatchException ex){
        logger.error("Erro na leitura do número!", ex);
        return 0;
    } finally {
        scanner.nextLine();
    }



}

}
