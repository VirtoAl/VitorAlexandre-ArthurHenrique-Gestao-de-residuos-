package br.edu.up.gestaoresiduos.materiais;

import br.edu.up.gestaoresiduos.abstrata.Residuos;

public class Vidro extends Residuos {
    public Vidro(double quantidade) {
        super("Vidro", quantidade);
    }


    @Override
    public void processarResiduos() {
        // Lógica específica para processar papel
    }
}
