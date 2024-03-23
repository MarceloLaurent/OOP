package controller;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if(salario < 1412) {
            this.salario = 1412;
        }
    }

    public double getSalarioLiquido(double descontos, double beneficios){
        return salario + beneficios - descontos;
    }
}
