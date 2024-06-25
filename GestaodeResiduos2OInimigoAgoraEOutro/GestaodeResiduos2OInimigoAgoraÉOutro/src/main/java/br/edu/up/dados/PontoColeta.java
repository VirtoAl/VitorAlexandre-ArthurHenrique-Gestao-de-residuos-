package br.edu.up.dados;

public class PontoColeta {

    private String pontoMetal;
    private String pontoPapel;
    private String pontoPlastico;
    private String pontoVidro;

    public PontoColeta(String pontoMetal, String pontoPapel, String pontoPlastico, String pontoVidro) {
        this.pontoMetal = pontoMetal;
        this.pontoPapel = pontoPapel;
        this.pontoPlastico = pontoPlastico;
        this.pontoVidro = pontoVidro;
    }

    public String getPontoMetal() {
        return pontoMetal;
    }

    public void setPontoMetal(String pontoMetal) {
        this.pontoMetal = pontoMetal;
    }

    public String getPontoPapel() {
        return pontoPapel;
    }

    public void setPontoPapel(String pontoPapel) {
        this.pontoPapel = pontoPapel;
    }

    public String getPontoPlastico() {
        return pontoPlastico;
    }

    public void setPontoPlastico(String pontoPlastico) {
        this.pontoPlastico = pontoPlastico;
    }

    public String getPontoVidro() {
        return pontoVidro;
    }

    public void setPontoVidro(String pontoVidro) {
        this.pontoVidro = pontoVidro;
    }
}
