package br.edu.up;

import br.edu.up.dados.view.Execucao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import br.edu.up.dados.util.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Logger logger = LogManager.getLogger(Main.class);

        int op;
        Scanner scanner = new Scanner(System.in);

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
        if(op == 1){
            Execucao.executar(scanner);
        }
    };
}