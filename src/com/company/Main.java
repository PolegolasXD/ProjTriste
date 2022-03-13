package com.company;
import java.util.Scanner;

import models.Usuarios;

public class Main {
    public static void limpar_tela(){
        for(int i = 0; i < 100; i++){
            System.out.println("\n");
        }
    }

    public static void listar_usuarios(Usuarios users){
        if (users.getNome() == null){
            System.out.println("Usuário não cadastrado");
        } else {
            System.out.print("Nome: " + users.getNome());
            System.out.println();

            System.out.print("Email: " + users.getEmail());
            System.out.println();

            System.out.print("Cpf: " + users.getCpf());
            System.out.println();

            System.out.print("Senha: " + users.getSenha());
            System.out.println("\n");
        }

    }

    public static void cadastrar_usuarios(Usuarios users){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scan.next();
        users.setNome(nome);

        System.out.print("Digite o seu email: ");
        String email = scan.next();
        users.setEmail(email);

        System.out.print("Digite o seu cpf: ");
        String cpf = scan.next();
        users.setCpf(cpf);

        System.out.print("Digite a sua senha: ");
        String senha = scan.next();
        users.setSenha(senha);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Usuarios[] users = new Usuarios[5];
        boolean loop = true;

        int contador = 0;
        int verificacao = 0;

        for(int i = 0; i < users.length; i++){
            users[i] = new Usuarios();
        }

        while(loop){
            System.out.println("\n\n\nBem vindo ao programa do fabio");
            System.out.println("Você deseja: \n1 - Fazer cadastro de um único usuário\n2 - listar usuários\n0 - sair\n\n\n");

            verificacao = Integer.parseInt(scan.next());

            if (verificacao == 0){
                limpar_tela();
                System.out.println("Tchau :>");
                loop = false;
            }

            if (verificacao == 1){
                limpar_tela();
                cadastrar_usuarios(users[contador]);
                contador++;
            }

            if (verificacao == 2){
                limpar_tela();
                System.out.println("Usuários cadastrados: " + contador);
                System.out.println(" ----------- // ----------- \n\n");
                for(int i = 0; i < contador; i++){
                    listar_usuarios(users[i]);
                }
                System.out.println("\n ----------- // ----------- \n");
            }
        }

    }
}
