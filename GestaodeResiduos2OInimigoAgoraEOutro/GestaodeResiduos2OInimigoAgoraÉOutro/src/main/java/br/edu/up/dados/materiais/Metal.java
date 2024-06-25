package br.edu.up.dados.materiais;

import br.edu.up.dados.abstrata.Residuos;

public class Metal extends Residuos {
    public Metal(double quantidade) {
        super("Metal", quantidade);
    }


    @Override
    public void processarResiduos() {
        // Lógica específica para processar papel
    }
}