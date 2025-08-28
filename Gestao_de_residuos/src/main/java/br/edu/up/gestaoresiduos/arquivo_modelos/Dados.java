package br.edu.up.gestaoresiduos.arquivo_modelos;

import br.edu.up.gestaoresiduos.controllers.PontoColetaController;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Dados implements FormatoEscrita{
    private static final String DADOS_FILE = "Gestão dos resíduos.txt";
    public static void gestaoLog() {
        try (FileWriter fileWriter = new FileWriter(DADOS_FILE, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println("=========================================");
            for (int i = 0; i < PontoColetaController.pontosColeta.size(); i++) {
                printWriter.print("Ponto de coleta: " + PontoColetaController.pontosColeta.get(i).getNome() + PontoColetaController.pontosColeta.get(i).toString());
            }
            printWriter.println("=========================================");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String formatacao() {
        return "aopa";
    }
}