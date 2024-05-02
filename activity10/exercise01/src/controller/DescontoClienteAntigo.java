package controller;

import model.Produto;

public class DescontoClienteAntigo implements IDesconto{
    @Override
    public double calculaDesconto(Produto produto) {
        return produto.getPreco() * 0.2;
    }
}
