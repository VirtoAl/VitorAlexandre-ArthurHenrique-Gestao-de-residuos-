package br.edu.up;

import br.edu.up.gestaoresiduos.Empresa;
import br.edu.up.gestaoresiduos.abstrata.Usuario;
import br.edu.up.gestaoresiduos.view.Execucao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import br.edu.up.gestaoresiduos.util.Util;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        final Logger logger = LogManager.getLogger(Main.class);

        int op;
        Scanner scanner = new Scanner(System.in);

        Usuario teste = new Empresa();

        teste.setId(UUID.fromString("ec49d2d4-3012-4fa1-b4f4-3ee36db0f69"));

        do {
            exibirMenu();
            op = Util.lerInteiro(scanner);
            exibirMenu(scanner, op);
        } while (op != 2);


    }
    public static void exibirMenu(){
        System.out.println("======================================");
        System.out.println("        Gestão de resíduos");
        System.out.println("1- Acessar menu de controle");
        System.out.println("2- Sair ");
        System.out.println("======================================");
    }
    public static void exibirMenu(Scanner scanner, int op){
        switch (op){
            case 1 -> Execucao.executar(scanner);
            case 2 -> System.out.println("Finalizando sistema...");
            default -> Util.erro("Leitura não está dentro do escopo esperado");
        }
    };
}