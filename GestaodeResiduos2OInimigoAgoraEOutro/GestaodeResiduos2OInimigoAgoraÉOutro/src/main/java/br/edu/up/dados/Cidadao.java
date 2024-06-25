package br.edu.up.dados;

public class Cidadao extends Pessoa {
    public Cidadao(int id, String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public void realizarAcao() {
        // Lógica específica para ações de empresa
    }
}
