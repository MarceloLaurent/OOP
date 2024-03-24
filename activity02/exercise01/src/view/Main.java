package view;

import controller.ItemPedido;
import controller.Pedido;
import controller.Produto;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Produto produto1 = new Produto();
        produto1.setDescricao("Pastel");
        produto1.setValor(20);

        Produto produto2 = new Produto();
        produto2.setDescricao("Caldo de cana");
        produto2.setValor(10);

        ItemPedido item1 = new ItemPedido();
        item1.setProduto(produto1);
        item1.setQuantidade(2);

        ItemPedido item2 = new ItemPedido();
        item2.setProduto(produto2);
        item2.setQuantidade(1);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.printf("O valor total do seu pedido é: R$%.2f.", pedido.getValorTotal());
    }
}