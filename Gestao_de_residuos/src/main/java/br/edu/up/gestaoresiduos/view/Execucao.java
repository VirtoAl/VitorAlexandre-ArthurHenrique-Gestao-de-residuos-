package br.edu.up.gestaoresiduos.view;

import br.edu.up.gestaoresiduos.PontoColeta;
import br.edu.up.gestaoresiduos.controllers.PontoColetaController;
import br.edu.up.gestaoresiduos.util.Util;

import java.util.Scanner;

public class Execucao {
    public static void executar(Scanner scanner){
        int op;
        exibirMenu();
        op = Util.lerInteiro(scanner);
        exibirMenu(scanner, op);
        if(op != 0){
            executar(scanner);
        }
    }
    public static void exibirMenu(){
        System.out.println("==================================");
        System.out.println("0- Voltar menu");
        System.out.println("1- Cadastrar novo ponto de coleta");
        System.out.println("2- remover ponto de coleta");
        System.out.println("3- Listar pontos de coleta disponíveis");
        System.out.println("4- Detalhar especificações atuais de ponto de coleta");
        System.out.println("5- Registrar depósito de resíduos de empresa parceira");
        System.out.println("6- Atualizar registro de depósito de empresa parceira");
    }

    public static void exibirMenu(Scanner scanner, int op){

        switch (op){
            case 0 -> System.out.println("Retornando ao menu principal...");
            case 1 -> cadastrarPonto(scanner);
            case 2 -> removerPonto(scanner);
            case 3 -> listarPontos();
            case 4 -> detalharPonto(scanner);
            case 5 -> depositarResiduos(scanner);
            case 6 -> atualizarDeposito(scanner);
            default -> Util.erro("Leitura não está dentro do escopo esperado");

        }
    }
    public static void cadastrarPonto(Scanner scanner){
        System.out.print("Insira o nome do ponto de coleta a cadastrar: ");
        String resposta = scanner.nextLine();
        PontoColeta pontoNovo = new PontoColeta(resposta);
        PontoColetaController.addPontoColeta(pontoNovo, resposta);
    }
    public static void removerPonto(Scanner scanner){
        if (PontoColetaController.verificaLista()) {
            PontoColetaController.listarPontosColeta();
            System.out.println("Insira o nome do ponto de coleta a remover: ");
            String resposta = scanner.nextLine();
            PontoColetaController.removePontoColeta(resposta);
        }
    }
    public static void listarPontos(){
        if(PontoColetaController.verificaLista()) {
            PontoColetaController.listarPontosColeta();
        }
    }
    public static void detalharPonto(Scanner scanner){
        if(PontoColetaController.verificaLista()) {
            PontoColetaController.listarPontosColeta();
            System.out.println("Insira o nome do ponto de coleta: ");
            String resposta = scanner.nextLine();
            PontoColetaController.detalharPonto(resposta);
        }
    }
    public static void depositarResiduos(Scanner scanner){
        if(PontoColetaController.verificaLista()) {
            PontoColetaController.listarPontosColeta();
            System.out.println("Insira o nome do ponto de coleta: ");
            String resposta = scanner.nextLine();
            System.out.println("Materiais válidos: Metal | Papel | Plastico | Vidro");
            System.out.println("Insira o tipo de material que será depositado ");
            String material = scanner.next();
            System.out.println("Insira a quantidade em Kg: ");
            Double quantidade = scanner.nextDouble();
            PontoColetaController.addResiduo(resposta, material, quantidade);
            scanner.nextLine();
        }
    }
    public static void atualizarDeposito(Scanner scanner){
        if(PontoColetaController.verificaLista()) {
            PontoColetaController.listarPontosColeta();
            System.out.println("Insira o nome do ponto de coleta: ");
            String resposta = scanner.nextLine();
            System.out.println("Materiais válidos: Metal | Papel | Plastico | Vidro");
            System.out.println("Insira o tipo de material que será alterado ");
            String material = scanner.next();
            System.out.println("Insira quantos Kg desse material deseja estar reservado no ponto: ");
            Double quantidade = scanner.nextDouble();
            PontoColetaController.atualizarResiduo(resposta, material, quantidade);
            scanner.nextLine();
        }
    }
}
