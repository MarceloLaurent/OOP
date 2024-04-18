package view;

import controller.FuncionarioFactory;

public class Main {
    public static void main(String[] args) {

        FuncionarioFactory ff = new FuncionarioFactory();

        //System.out.println(ff.contratarFuncionarioIntegral());
        //System.out.println(ff.contratarFuncionarioParcial());
        System.out.println(ff.contratrarFuncionarioTemporario());

    }
}
