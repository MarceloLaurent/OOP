package controller;

public class ContaBancaria {

    public int numeroConta;
    public String nome;
    public double saldo;

    public ContaBancaria() {
    }

    public void realizarDeposito(double valor){
        saldo += valor;
    }

    public void realizarSaque(double valor){
        saldo -= valor;
    }
}
