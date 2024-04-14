package view;

import controller.OperacaoController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OperacaoController op = new OperacaoController();

        System.out.println("Digite um número inteiro: ");

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        op.OperacaoValor(numero);
    }
}