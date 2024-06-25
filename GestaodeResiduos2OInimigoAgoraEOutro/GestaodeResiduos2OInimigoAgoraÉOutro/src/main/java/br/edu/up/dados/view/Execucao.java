package br.edu.up.dados.view;

import br.edu.up.dados.util.Util;

import java.util.Scanner;

public class Execucao {

    public static void executar(Scanner scanner){
        int op;
        exibirMenu();
        op = Util.lerInteiro(scanner);
        exibirMenu(scanner, op);
    }
    public static void exibirMenu(){
        System.out.println("==================================");
        System.out.println("1- Cadastrar ponto de coleta");
        System.out.println("2- Retirar ponto de coleta");
        System.out.println("3- Listar pontos de coleta disponíveis");
    }

    public static void exibirMenu(Scanner scanner, int op){
        switch (op){
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();

        }
    }
    public static void cadastrasPonto(){

    }
}
