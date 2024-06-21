package org.example;

public class Metal extends Residuos {
    public Metal(double quantidade) {
        super("Metal", quantidade);
    }


    @Override
    public void processarResiduos() {
        // Lógica específica para processar papel
    }
}