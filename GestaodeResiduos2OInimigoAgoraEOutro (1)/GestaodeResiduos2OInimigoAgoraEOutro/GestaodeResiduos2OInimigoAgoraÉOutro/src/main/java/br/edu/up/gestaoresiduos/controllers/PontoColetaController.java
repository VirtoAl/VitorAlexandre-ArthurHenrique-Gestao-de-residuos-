package br.edu.up.gestaoresiduos.controllers;

import br.edu.up.gestaoresiduos.PontoColeta;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToLongFunction;

public abstract class PontoColetaController {
    private static final Logger logger = LogManager.getLogger(PontoColetaController.class);
    public static List<PontoColeta> pontosColeta = new ArrayList<>();

    public static void addPontoColeta(PontoColeta pontoColeta, String nomePonto) {
        if(verificaSeExiste(nomePonto)){
            pontosColeta.add(pontoColeta);
            logger.info("Ponto de coleta adicionado: " + pontoColeta.getNome());
        }
    }

    public static void removePontoColeta(String nomePonto) {
        for (int i = 0; i < pontosColeta.size(); i++) {
            if (pontosColeta.get(i).getNome().equals(nomePonto)) {
                pontosColeta.remove(i);
                logger.info("Ponto de coleta removido: " + nomePonto);
            }
        }
    }
    public static Boolean verificaSeExiste(String nomePonto){
            for(int i = 0; i < pontosColeta.size(); i++){
                if(pontosColeta.get(i).getNome().equals(nomePonto)){
                    logger.error("Ponto de coleta já existe!");
                    return false;
                }
            }
            return true;
        }

    public static void listarPontosColeta(){
        for(int i = 0; i < pontosColeta.size(); i++){
            System.out.println(pontosColeta.get(i).formatacao());
        }
    }
    public static void detalharPonto(String nomePonto){
        for (int i = 0; i < pontosColeta.size(); i++) {
            if (pontosColeta.get(i).getNome().equals(nomePonto)) {
                System.out.println("detalhes do ponto de coleta "+ nomePonto + pontosColeta.get(i).toString());
            }
        }
    }

    public static void addResiduo(String nomePonto, String material, Double quantidade){
        for(int i = 0; i < pontosColeta.size(); i++){

            if (pontosColeta.get(i).getNome().equals(nomePonto)) {
                switch (material){
                    case "Vidro" -> {
                        quantidade += pontosColeta.get(i).getQuantidadeVidro();
                        pontosColeta.get(i).setQuantidadeVidro(quantidade);
                    }
                    case "Metal" -> {
                        quantidade += pontosColeta.get(i).getQuantidadeMetal();
                        pontosColeta.get(i).setQuantidadeMetal(quantidade);
                    }
                    case "Plastico" -> {
                        quantidade += pontosColeta.get(i).getQuantidadePlastico();
                        pontosColeta.get(i).setQuantidadeVidro(quantidade);
                    }
                    case "Papel" -> {
                        quantidade += pontosColeta.get(i).getQuantidadePapel();
                        pontosColeta.get(i).setQuantidadeVidro(quantidade);
                    }
                    default -> logger.error("Material não identificado!");
                }
            }
        }
    }
    public static void atualizarResiduo(String nomePonto, String material, Double quantidade){
        for(int i = 0; i < pontosColeta.size(); i++){
            if (pontosColeta.get(i).getNome().equals(nomePonto)) {
                switch (material){
                    case "Vidro" -> pontosColeta.get(i).setQuantidadeVidro(quantidade);
                    case "Metal" -> pontosColeta.get(i).setQuantidadeMetal(quantidade);
                    case "Plastico" -> pontosColeta.get(i).setQuantidadePlastico(quantidade);
                    case "Papel" -> pontosColeta.get(i).setQuantidadePapel(quantidade);
                    default -> logger.error("Material não identificado!");
                }
            }
        }
    }
}