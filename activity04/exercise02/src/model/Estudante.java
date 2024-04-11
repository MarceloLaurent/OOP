package model;

public class Estudante {

    private String nome;
    private String ra;
    private String email;
    private float mediaNotas;
    private int quantidadeAprovacoes;

    public Estudante() {
    }

    public Estudante(String nome, String ra, String email, float mediaNotas, int quantidadeAprovacoes) {
        this.nome = nome;
        this.ra = ra;
        this.email = email;
        this.mediaNotas = mediaNotas;
        this.quantidadeAprovacoes = quantidadeAprovacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(float mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public int getQuantidadeAprovacoes() {
        return quantidadeAprovacoes;
    }

    public void setQuantidadeAprovacoes(int quantidadeAprovacoes) {
        this.quantidadeAprovacoes = quantidadeAprovacoes;
    }
}
