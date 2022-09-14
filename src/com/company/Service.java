package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {


    static void LybrarySystem() {
        User user = new User();
        User.loginSystem();
        List<Book> listBook = new ArrayList<Book>();
        System.out.println("==========================================");
        System.out.println("Bem-vindo ao sistema de catalogo de livros!");
        System.out.println("==========================================");
        IS:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("==========================================");
            System.out.println("Qual ação deseja realizar?");
            System.out.println("==========================================");
            System.out.println("1 - salvar");
            System.out.println("2 - editar");
            System.out.println("3 - deletar");
            System.out.println("4 - sair");
            System.out.println("==========================================");
            int escolha = scanner.nextInt();


            if (escolha == 1) {
                Book book = new Book();
                System.out.println("Digite um isbn para o livro");
                book.isbn = scanner.nextInt();
                System.out.println("Digite o titulo do livro");
                book.title = scanner.nextLine();
                System.out.println("Digite o autor do livro");
                book.author = scanner.nextLine();
                System.out.println("Digite o ano de publicação do livro");
                book.year = scanner.nextInt();
                System.out.println("Digite a publicadora do livro");
                book.publisher = scanner.nextLine();

                listBook.add(book);

            } else if (escolha == 2) {

                IPS:
                while (true) {
                    Scanner scannerEdit = new Scanner(System.in);
                    System.out.println("Digite o isbn do livro que gostaria de editar");
                    int isbnEscolhido = scannerEdit.nextInt();
                    for (int i = 0; i < listBook.size(); i++) {
                        if (listBook.get(i).isbn.equals(isbnEscolhido)) {
                            System.out.println("Escolha que edição gostaria de fazer");
                            System.out.println("1 - Editar título");
                            System.out.println("2 - Editar autor");
                            System.out.println("3 - Editar ano de publicção");
                            System.out.println("4 - Editar a publicadora");
                            System.out.println("5 - Para sair da edição");
                            int editEscolhido = scannerEdit.nextInt();

                            if (editEscolhido == 1) {
                                System.out.println("Digite o novo titulo para o livro");
                                String novoTitulo = scannerEdit.nextLine();
                                listBook.get(i).title = novoTitulo;
                            } else if (editEscolhido == 2) {
                                System.out.println("Digite o novo autor para o livro");
                                String novoAutor = scannerEdit.nextLine();
                            } else if (editEscolhido == 3) {
                                System.out.println("Digite o novo ano de publicação");
                                String novoAno = scannerEdit.nextLine();
                            } else if (editEscolhido == 4) {
                                System.out.println("Digite a nova publicadora");
                                String novoPub = scannerEdit.nextLine();
                            } else if (editEscolhido == 5) {
                                System.out.println("-=SAINDO=-");
                                break IPS;
                            }
                        }
                    }
                }
            } else if (escolha == 3) {
                INSS:
                while (true) {
                    Scanner scannerEdit = new Scanner(System.in);
                    System.out.println("Digite o isbn do livro que gostaria de deletar");
                    int isbnEscolhido = scannerEdit.nextInt();
                    for (int i = 0; i < listBook.size(); i++) {
                        if (listBook.get(i).isbn.equals(isbnEscolhido)){
                            listBook.remove(i);
                            System.out.println("ISBN " + isbnEscolhido + "Deletado");
                        }
                    }
                    System.out.println("Deseja  continuar a excluir ou sair?");
                    System.out.println("Digite 1 pra continuar ou 0 para sair");
                    int opcao = scanner.nextInt();
                    if (opcao == 0){
                        break INSS;
                    }
                }
            }else if(escolha==4){
                System.out.println("Até masi tarde!");
                break IS;
            }
        }
    }
}