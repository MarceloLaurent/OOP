package view;

import controller.ContaEspecial;
import controller.ContaPoupanca;

public class Contas {
    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca("Leandro", 123, 6000, 15);

        ContaEspecial ce = new ContaEspecial("Leandro", 1234, 5000, 2000);

        System.out.println("Sacando dentro do saldo poupança e do limite especial...");
        poupanca.sacar(5000);
        System.out.printf("Saldo Conta Poupança: R$%.2f\n",poupanca.getSaldo());
        ce.sacar(5000);
        System.out.printf("Saldo Conta Especial: R$%.2f\n",ce.getSaldo());

        System.out.println("\nTentando sacar fora do saldo poupança e dentro do limite especial...");
        poupanca.sacar(2000);
        System.out.printf("Saldo Conta Poupança: R$%.2f\n",poupanca.getSaldo());
        ce.sacar(2000);
        System.out.printf("Saldo Conta Especial: R$%.2f\n",ce.getSaldo());

        System.out.println("\nTentando sacar fora do limite especial...");
        ce.sacar(100);

        System.out.println("\nEfetuando depósitos...");
        poupanca.depositar(1000);
        System.out.printf("Saldo Conta Poupança: R$%.2f\n",poupanca.getSaldo());
        ce.depositar(1000);
        System.out.printf("Saldo Conta Especial: R$%.2f\n",ce.getSaldo());

        System.out.println("\nRendimento da poupança com 6% de taxa...");
        poupanca.calcularNovoSaldo(0.06f);
        System.out.printf("Novo saldo: R$%.2f\n", poupanca.getSaldo());

        System.out.println("\nImprimindo dados das contas...");
        System.out.println(poupanca);
        System.out.println(ce);
    }
}