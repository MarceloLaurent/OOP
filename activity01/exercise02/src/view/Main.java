package view;

import controller.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.realizarDeposito(1000);
        conta.realizarSaque(500);

        System.out.printf("Saldo atual: R$%.2f", conta.saldo);
    }
}