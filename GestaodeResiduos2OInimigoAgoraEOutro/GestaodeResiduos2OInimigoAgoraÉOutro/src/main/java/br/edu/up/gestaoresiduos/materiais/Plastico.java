package br.edu.up.gestaoresiduos.materiais;

import br.edu.up.gestaoresiduos.abstrata.Residuos;

public class Plastico extends Residuos {
    public Plastico(double quantidade) {
        super("Plastico", quantidade);
    }


    @Override
    public void processarResiduos() {
        // Lógica específica para processar papel
    }
}