package br.edu.up.gestaoresiduos.controllers;

import br.edu.up.gestaoresiduos.arquivo_modelos.Dados;
import br.edu.up.gestaoresiduos.abstrata.Residuos;

import java.util.ArrayList;
import java.util.List;

public class ResiduosController {
    private List<Residuos> residuos = new ArrayList<>();

    public void addResiduos(Residuos residuo) {
        residuos.add(residuo);

        Dados.log("Resíduo adicionado: " + residuo.toString());
    }

    public void removeResiduos(Residuos residuo) {
        residuos.remove(residuo);
        Dados.log("Resíduo removido: " + residuo.toString());
    }

    // Métodos adicionais para atualização e listagem
}