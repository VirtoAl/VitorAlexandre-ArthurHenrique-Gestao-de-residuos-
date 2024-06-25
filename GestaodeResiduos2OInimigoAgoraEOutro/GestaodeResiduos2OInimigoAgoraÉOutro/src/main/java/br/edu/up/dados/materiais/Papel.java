package br.edu.up.dados.materiais;

import br.edu.up.dados.abstrata.Residuos;

public class Papel extends Residuos {
    public Papel(double quantidade) {
        super("Papel", quantidade);

    }

    @Override
    public void processarResiduos() {

    }
}