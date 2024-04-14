package controller;

import java.util.InputMismatchException;

public class OperacaoController {

    public void OperacaoValor(int valor) {
        if(valor < 0) {
            throw new InputMismatchException("Operação válida apenas para números naturais");
        } else if (valor % 2 == 0) {
            System.out.println("Quadrado do número informado: " + (int)Math.pow(valor, 2));
        } else {
            System.out.println("Cubo do número informado: " + (int)Math.pow(valor, 3));
        }
    }
}
