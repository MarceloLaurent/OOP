package controller;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroNota;
    private double valorTotal;

    private final List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorTotal() {
        for (ItemPedido item: itens) {
            valorTotal += item.getQuantidade() * item.getProduto().getValor();
        }
        return valorTotal;
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }
}
