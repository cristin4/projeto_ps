import users.User;
import utils.UserControl;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void start(){

        ArrayList<User> users = new ArrayList<>();

        boolean sair = false;

        while(!sair){

            System.out.println("""
                                Escolha uma opção:
                                1: Criar conta
                                2: Criar/Editar perfil
                                3: Adicionar amigos
                                4: Envio de mensagens
                                5: Criar comunidade
                                6: Adicionar a comunidade
                                7: Recuperar dados
                                8: Remover conta
                                9: Envio de mensagem no Feed
                                10: Controle de visualização
                                11: Imprimir
                                12: Sair""");

            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Criação de Conta");
                    User newUser = UserControl.create();
                    users.add(newUser);
                    UserControl.print(newUser);
                }
                case 2 -> {
                    System.out.println("Criar ou editar perfil");
                    UserControl.update(users);
                }
                case 3 -> System.out.println("Opção 3");
                case 4 -> System.out.println("Opção 4");
                case 5 -> System.out.println("Opção 5");
                case 6 -> System.out.println("Opção 6");
                case 7 -> System.out.println("Opção 7");
                case 8 -> {
                    if(!users.isEmpty()){
                        UserControl.remove(users);
                    }
                    else{
                        System.out.println("Não há perfil no iFace");
                    }
                }
                case 9 -> System.out.println("Opção 9");
                case 10 -> System.out.println("Opção 10");
                case 11 -> UserControl.printAll(users);
                case 12 -> {
                    sair = true;
                    System.out.println("Saindo do sistema");
                }
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
