package org.example;

public class Cidadao extends Pessoa {
    public Cidadao(int id, String nome, String endereco) {
        super(id, nome, endereco);
    }

    @Override
    public void realizarAcao() {
        // Lógica específica para ações de empresa
    }
}
