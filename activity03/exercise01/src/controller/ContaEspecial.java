package controller;

public class ContaEspecial extends ContaBancaria{

    private float limite;

    public ContaEspecial() {
    }

    public ContaEspecial(String nome, int numeroConta, float saldo, float limite) {
        super(nome, numeroConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta Especial = {" +
                "Nome: " + getNome() +
                "; Número da Conta: " + getNumeroConta() +
                "; Saldo: R$" + String.format("%.2f", getSaldo()) +
                "; Limite: R$" + String.format("%.2f", limite) +
                '}';
    }

    @Override
    public void sacar(float valor) {
        if(getSaldo() >= valor - limite){
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Limite insuficiente.");
        }
    }
}
