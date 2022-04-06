package utils;

import users.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserControl {

    public static User create() {
        Scanner input = new Scanner(System.in);

        System.out.print("Login do usuário: ");
        String login = input.nextLine();

        System.out.println("Digite sua senha:");
        String password = input.nextLine();

        System.out.println("Nome do perfil:");
        String name = input.nextLine();

        return new User(login, password, name);
    }

    public static void update(ArrayList<User> users) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o login do usuário e senha");
        System.out.print("Login do usuário: ");
        String login = input.nextLine();

        System.out.print("Digite sua senha:");
        String password = input.nextLine();

        User updateUser = meet(users,login,password);
        if(updateUser == null){
            System.out.println("Login ou senha incorreto, tente novamente");
            return;
        }

        System.out.println("""
                           Informe o que incluir ou atualizar:
                           1 - Nome
                           2 - Idade
                           3 - Apelido
                           4 - Escola
                           5 - Relacionamento
                           """);

        int opcao = input.nextInt();

        input.nextLine();

        switch (opcao) {
            case 1 -> {
                System.out.println("Digite o novo nome:");
                String newName = input.nextLine();
                updateUser.setName(newName);
            }
            case 2 -> {
                System.out.println("Digite a idade");
                int newAge = input.nextInt();
                updateUser.setAge(newAge);
            }
            case 3 -> {
                System.out.println("Digite o Apelido");
                String newNickname = input.nextLine();
                updateUser.setNickname(newNickname);
            }
            case 4 -> {
                System.out.println("Digite a escola");
                String newSchool = input.nextLine();
                updateUser.setSchool(newSchool);
            }
            case 5 -> {
                System.out.println("Digite seu status de relacionamento");
                String newRelationship = input.nextLine();
                updateUser.setRelationship(newRelationship);
            }
            default -> System.out.println("Informe uma opção válida.");
        }

    }

    public static void print(User newUser) {
        System.out.println("\nNome: " + newUser.getName()
                + "\nLogin: " + newUser.getLogin() + "\nSenha: " + newUser.getPassword());
    }

    public static void printAll(ArrayList<User> users){
        for(User user :users){
            System.out.println("\nNome: " + user.getName()
                    + "\nLogin: " + user.getLogin() + "\nSenha: " + user.getPassword()
            + "\nIdade: " + user.getAge() + "\nApelido: " + user.getNickname() + "\nSchool: "
            + "\nRelacionamento: " + user.getRelationship());
        }
    }

    public static User meet(ArrayList<User> users, String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
