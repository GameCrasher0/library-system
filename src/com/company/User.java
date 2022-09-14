package com.company;

import java.util.Scanner;

public class User {
    private final static String id = "Adminintacao";
    private final static String senha = "Admin*8090";


    static void loginSystem() {

        IS:
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entre com o usuario da admnistracao");
            String loginId = scanner.nextLine();
            System.out.println("Entre com a senha da admnistracao");
            String loginSenha = scanner.nextLine();

            if (loginId.equals(id) && loginSenha.equals(senha)) {
                System.out.println("Usuário logado com sucesso");
                break IS;
            } else {
                System.out.println("Login ou senha inválidos");
            }
        }

    }
}