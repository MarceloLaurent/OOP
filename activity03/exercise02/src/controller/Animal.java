package controller;

public class Animal {

    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void alteraPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void alteraCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void alteraAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void alteraVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void dados() {
        System.out.println( "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento + " cm" +
                ", patas=" + patas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidade=" + velocidade + " m/s" +
                '}');
    }
}
