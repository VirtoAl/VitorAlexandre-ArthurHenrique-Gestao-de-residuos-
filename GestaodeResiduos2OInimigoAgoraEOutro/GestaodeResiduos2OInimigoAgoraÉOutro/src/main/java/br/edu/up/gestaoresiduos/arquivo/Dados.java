package br.edu.up.gestaoresiduos.arquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Dados {
    private static final String DADOS_FILE = "Gestão dos resíduos.txt";

    public static void log(String message) {
        try (FileWriter fileWriter = new FileWriter(DADOS_FILE,true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
