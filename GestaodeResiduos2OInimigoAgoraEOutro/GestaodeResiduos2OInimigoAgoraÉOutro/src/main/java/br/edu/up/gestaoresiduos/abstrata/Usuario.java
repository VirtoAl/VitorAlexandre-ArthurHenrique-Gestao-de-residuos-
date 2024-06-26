package br.edu.up.gestaoresiduos.abstrata;

import java.util.UUID;

public abstract class Usuario {
    private UUID id;
    private String nome;

    public Usuario() {
        this.id = id;
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public abstract void realizarAcao();
}
