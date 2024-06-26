package br.edu.up.gestaoresiduos;

import br.edu.up.gestaoresiduos.abstrata.Usuario;

public class Empresa extends Usuario {

    private String CNPJ;

    public Empresa() {
        super();
        this.CNPJ = CNPJ;
    }

    @Override
    public void realizarAcao() {
        // Lógica específica para ações de empresa]
    }
}












