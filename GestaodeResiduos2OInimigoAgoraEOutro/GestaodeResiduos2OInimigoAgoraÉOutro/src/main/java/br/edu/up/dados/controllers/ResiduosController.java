package br.edu.up.dados.controllers;

import br.edu.up.dados.Logger;
import br.edu.up.dados.abstrata.Residuos;

import java.util.ArrayList;
import java.util.List;

public class ResiduosController {
    private List<Residuos> residuos = new ArrayList<>();

    public void addResiduos(Residuos residuo) {
        residuos.add(residuo);
        Logger.log("Resíduo adicionado: " + residuo.toString());
    }

    public void removeResiduos(Residuos residuo) {
        residuos.remove(residuo);
        Logger.log("Resíduo removido: " + residuo.toString());
    }

    // Métodos adicionais para atualização e listagem
}