package br.edu.up.gestaoresiduos.controllers;

import br.edu.up.gestaoresiduos.arquivo.Dados;
import br.edu.up.gestaoresiduos.PontoColeta;

import java.util.ArrayList;
import java.util.List;

public class PontoColetaController {
    private List<PontoColeta> pontosColeta = new ArrayList<>();

    public void addPontoColeta(PontoColeta pontoColeta) {
        pontosColeta.add(pontoColeta);
        Dados.log("Ponto de coleta adicionado: " + pontoColeta.toString());
    }

    public void removePontoColeta(PontoColeta pontoColeta) {
        pontosColeta.remove(pontoColeta);
        Dados.log("Ponto de coleta removido: " + pontoColeta.toString());
    }

    // Métodos adicionais para atualização e listagem
}