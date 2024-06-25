package br.edu.up.dados.materiais;

import br.edu.up.dados.abstrata.Residuos;

public class Plastico extends Residuos {
    public Plastico(double quantidade) {
        super("Plastico", quantidade);
    }


    @Override
    public void processarResiduos() {
        // Lógica específica para processar papel
    }
}