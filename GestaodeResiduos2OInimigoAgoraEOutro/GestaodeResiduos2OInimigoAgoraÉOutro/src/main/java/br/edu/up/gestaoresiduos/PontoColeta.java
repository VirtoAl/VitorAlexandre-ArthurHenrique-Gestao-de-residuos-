package br.edu.up.gestaoresiduos;

import br.edu.up.gestaoresiduos.arquivo_modelos.FormatoEscrita;
import br.edu.up.gestaoresiduos.materiais.Metal;
import br.edu.up.gestaoresiduos.materiais.Papel;
import br.edu.up.gestaoresiduos.materiais.Plastico;
import br.edu.up.gestaoresiduos.materiais.Vidro;

public class PontoColeta implements FormatoEscrita {

    private String nome;
    private Metal pontoMetal;
    private Papel pontoPapel;
    private Plastico pontoPlastico;
    private Vidro pontoVidro;

    public PontoColeta(String nome, Metal pontoMetal, Papel pontoPapel, Plastico pontoPlastico, Vidro pontoVidro) {
        this.nome = nome;
        this.pontoMetal = pontoMetal;
        this.pontoPapel = pontoPapel;
        this.pontoPlastico = pontoPlastico;
        this.pontoVidro = pontoVidro;
    }
    public PontoColeta(String nome){
        this.nome = nome;
        this.pontoMetal = new Metal(0);
        this.pontoPapel = new Papel(0);
        this.pontoPlastico = new Plastico(0);
        this.pontoVidro = new Vidro(0);
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidadeMetal(Double quantidadeMetal) {
        this.pontoMetal.setQuantidade(quantidadeMetal);

    }

    public void setQuantidadePapel(Double quantidadePapel) {
        this.pontoPapel.setQuantidade(quantidadePapel);
    }

    public void setQuantidadePlastico(Double quantidadePlastico) {
        this.pontoPlastico.setQuantidade(quantidadePlastico);
    }

    public void setQuantidadeVidro(Double quantidadeVidro) {
        this.pontoVidro.setQuantidade(quantidadeVidro);
    }

    public Papel getPontoPapel() {
        return pontoPapel;
    }

    public Plastico getPontoPlastico() {
        return pontoPlastico;
    }

    public Vidro getPontoVidro() {
        return pontoVidro;
    }

    @Override
    public String formatacao() {
        return "Ponto de coleta: " + nome;
    }

    @Override
    public String toString() {
        return ":\nQuantidade de Metal: " + pontoMetal.getQuantidade() +
                "\nQuantidade de Papel: " + pontoPapel.getQuantidade() +
                "\nQuantidade de Plástico: " + pontoPlastico.getQuantidade() +
                "\nQuantidade de Vidro: " + pontoVidro.getQuantidade() + "\n";
    }
}
