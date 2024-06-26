package br.edu.up.gestaoresiduos.view;

import br.edu.up.gestaoresiduos.util.Util;

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
        System.out.println("2- Registrar novo ponto de coleta");
        System.out.println("3- Listar pontos de coleta disponíveis");
        System.out.println("4- Detalhar especificações atuais de ponto de coleta");
        System.out.println("5- Registrar depósito de resíduos de empresa parceira");
        System.out.println("6- Atualizar registro de depósito de empresa parceira");
    }

    public static void exibirMenu(Scanner scanner, int op){
        switch (op){
            case 1 -> cadastrarPonto();
            case 2 -> registrarPonto();
            case 3 -> listarPontos();
            case 4 -> detalharPonto();
            case 5 -> depositarResiduos();
            case 6 -> atualizarDeposito();
            default -> Util.erro("Leitura não está dentro do escopo esperado");
        }
    }
    public static void cadastrarPonto(){

    }
    public static void registrarPonto(){

    }
    public static void listarPontos(){

    }
    public static void detalharPonto(){

    }
    public static void depositarResiduos(){

    }
    public static void atualizarDeposito(){

    }
}
