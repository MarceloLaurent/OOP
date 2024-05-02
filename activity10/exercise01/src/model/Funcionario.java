package model;

public class Funcionario {
    private String nome;

    public Funcionario() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
