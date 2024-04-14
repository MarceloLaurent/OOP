package controller;

public class Conta {

    private int agencia;
    private int codigo;
    private float saldo;
    private float limite;

    public Conta() {
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Saldo após depósito: " + saldo);
    }

    public void sacar(float valor) throws IllegalArgumentException{
        if (valor > saldo + limite){
            throw new IllegalArgumentException("Limite total para saque: " + (limite + saldo));
        } else {
            saldo -= valor;
        }

        System.out.println("Saldo após saque: " + saldo);
    }
}
