package controller;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nome, int numeroConta, float saldo, int diaRendimento) {
        super(nome, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "Conta Poupança = {" +
                "Nome: " + getNome() +
                "; Número da Conta: " + getNumeroConta() +
                "; Saldo: R$" + String.format("%.2f", getSaldo()) +
                "; Dia de Rendimento: " + diaRendimento +
                '}';
    }

    public void calcularNovoSaldo(float taxaRendimento){
        setSaldo(getSaldo() + getSaldo() * taxaRendimento);
    }
}