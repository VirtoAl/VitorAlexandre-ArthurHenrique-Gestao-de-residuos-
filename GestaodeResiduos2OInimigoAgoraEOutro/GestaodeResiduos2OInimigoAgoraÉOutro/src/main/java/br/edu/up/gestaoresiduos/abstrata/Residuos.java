package br.edu.up.gestaoresiduos.abstrata;

public abstract class Residuos {
    private String tipo;
    private double quantidade;

    public Residuos(String tipo, double quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public abstract void processarResiduos();
}
