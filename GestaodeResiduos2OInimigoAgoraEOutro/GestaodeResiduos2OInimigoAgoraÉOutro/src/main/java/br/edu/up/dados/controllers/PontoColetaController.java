package br.edu.up.dados.controllers;

import br.edu.up.dados.Logger;
import br.edu.up.dados.PontoColeta;

import java.util.ArrayList;
import java.util.List;

public class PontoColetaController {
    private List<PontoColeta> pontosColeta = new ArrayList<>();

    public void addPontoColeta(PontoColeta pontoColeta) {
        pontosColeta.add(pontoColeta);
        Logger.log("Ponto de coleta adicionado: " + pontoColeta.toString());
    }

    public void removePontoColeta(PontoColeta pontoColeta) {
        pontosColeta.remove(pontoColeta);
        Logger.log("Ponto de coleta removido: " + pontoColeta.toString());
    }

    // Métodos adicionais para atualização e listagem
}