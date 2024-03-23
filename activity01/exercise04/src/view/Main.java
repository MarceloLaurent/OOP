package view;

import controller.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("led");
        produto1.setPreco(99.9f);
        produto1.setQtdEstoque(5);

        produto2.setNome("mouse");
        produto2.setPreco(29.9f);
        produto2.setQtdEstoque(0);

        System.out.println(produto1.verificaProdutoDisponivel("led"));
        System.out.printf("Valor total do estoque1: R$%.2f\n", produto1.totalValorEstoque());

        System.out.println(produto1.verificaProdutoDisponivel("mouse"));
        System.out.printf("Valor total do estoque2: R$%.2f\n", produto2.totalValorEstoque());
    }
}