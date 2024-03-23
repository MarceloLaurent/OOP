package view;

import controller.Pessoa;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pessoa pessoa = new Pessoa();

        pessoa.setDataNascimento(13, 5, 1905);

        System.out.println("Idade: " + pessoa.getIdade() + " anos");
    }
}