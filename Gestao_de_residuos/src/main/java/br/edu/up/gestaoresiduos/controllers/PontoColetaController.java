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
            if (pontosColeta.get(i).getNome().toUpperCase().equals(nomePonto.toUpperCase())) {
                pontosColeta.remove(i);
                logger.info("Ponto de coleta removido: " + nomePonto);
            }
        }
    }
    public static Boolean verificaSeExiste(String nomePonto){
            for(int i = 0; i < pontosColeta.size(); i++){
                if(pontosColeta.get(i).getNome().toUpperCase().equals(nomePonto.toUpperCase())){
                    logger.error("Ponto de coleta já existe!");
                    return false;
                }
            }
            return true;
        }

    public static Boolean verificaLista(){
        if (pontosColeta.isEmpty()) {
            logger.error("Nenhum ponto de coleta registrado ainda");
            return false;
        }
        return true;
    }

    public static void listarPontosColeta(){
        System.out.print("Pontos de coleta: ");
        for(int i = 0; i < pontosColeta.size(); i++){
            System.out.print(pontosColeta.get(i).formatacao());
        }
        System.out.println();
    }
    public static void detalharPonto(String nomePonto){
        for (int i = 0; i < pontosColeta.size(); i++) {
            if (pontosColeta.get(i).getNome().toUpperCase().equals(nomePonto.toUpperCase())) {
                System.out.println("detalhes do ponto de coleta: "+ nomePonto + pontosColeta.get(i).toString());
            }
        }
    }

    public static void addResiduo(String nomePonto, String material, Double quantidade){
        for(int i = 0; i < pontosColeta.size(); i++){

            if (pontosColeta.get(i).getNome().toUpperCase().equals(nomePonto.toUpperCase())) {
                switch (material.toUpperCase()){
                    case "VIDRO" -> {
                        quantidade += pontosColeta.get(i).getQuantidadeVidro();
                        pontosColeta.get(i).setQuantidadeVidro(quantidade);
                    }
                    case "METAL" -> {
                        quantidade += pontosColeta.get(i).getQuantidadeMetal();
                        pontosColeta.get(i).setQuantidadeMetal(quantidade);
                    }
                    case "PLASTICO" -> {
                        quantidade += pontosColeta.get(i).getQuantidadePlastico();
                        pontosColeta.get(i).setQuantidadePlastico(quantidade);
                    }
                    case "PAPEL" -> {
                        quantidade += pontosColeta.get(i).getQuantidadePapel();
                        pontosColeta.get(i).setQuantidadePapel(quantidade);
                    }
                    default -> logger.error("Material não identificado!");
                }
            }
        }
    }
    public static void atualizarResiduo(String nomePonto, String material, Double quantidade){
        for(int i = 0; i < pontosColeta.size(); i++){
            if (pontosColeta.get(i).getNome().toUpperCase().equals(nomePonto.toUpperCase())) {
                switch (material.toUpperCase()){
                    case "VIDRO" -> pontosColeta.get(i).setQuantidadeVidro(quantidade);
                    case "METAL" -> pontosColeta.get(i).setQuantidadeMetal(quantidade);
                    case "PLASTICO" -> pontosColeta.get(i).setQuantidadePlastico(quantidade);
                    case "PAPEL" -> pontosColeta.get(i).setQuantidadePapel(quantidade);
                    default -> logger.error("Material não identificado!");
                }
            }
        }
    }
}