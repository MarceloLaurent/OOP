package view;

import controller.Conta;

public class Main {
    public static void main(String[] args){

        Conta c = new Conta();
        c.setLimite(500);

        c.depositar(1000);
        c.sacar(600); //Efetua saque com sucesso
        c.sacar(1000); //Retorna erro
    }
}