package controller;

public class Produto {

    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public boolean verificaProdutoDisponivel(String nome){
        return nome.equals(this.nome) && this.qtdEstoque > 0;
    }

    public float totalValorEstoque(){
        return qtdEstoque * preco;
    }
}
