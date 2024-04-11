package view;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Main {
    public static void main(String[] args) {

        EstudanteTecnico tecnico = new EstudanteTecnico("Marcelo", "1234", "marcelo@email.com", 8.05f, 22);

        EstudanteSuperior superior = new EstudanteSuperior("Marcelo", "1234", "marcelo@email.com", 8.05f, 22, "FATEC", 2025);

        EstudanteTecnicoController tecnicoController = new EstudanteTecnicoController();
        EstudanteSuperiorController superiorController = new EstudanteSuperiorController();

        System.out.println("====Estudante Técnico====");
        System.out.printf("Percentual de Rendimento: %.2f", tecnicoController.percentualRendimento(tecnico));
        System.out.print("%");
        System.out.printf("\nPercentual de Progressão: %.2f", tecnicoController.percentualProgressao(tecnico));
        System.out.print("%");
        System.out.println("\n==========================");

        System.out.println("====Estudante Superior====");
        System.out.printf("Percentual de Rendimento: %.2f", superiorController.percentualRendimento(superior));
        System.out.print("%");
        System.out.printf("\nPercentual de Progressão: %.2f", superiorController.percentualProgressao(superior));
        System.out.print("%");
        System.out.println("\n==========================");
    }
}