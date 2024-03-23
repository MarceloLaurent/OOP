package view;

import controller.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Silva");
        funcionario.setCargo("Estagiário");
        funcionario.setSalario(750);

        System.out.printf("Salário Líquido: R$%.2f" ,funcionario.getSalarioLiquido(120, 150));
    }
}