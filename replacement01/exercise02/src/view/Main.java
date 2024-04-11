package view;

import controller.ProfessorHorista;
import controller.ProfessorTitular;

public class Main {
    public static void main(String[] args) {

        ProfessorTitular titular = new ProfessorTitular();
        titular.setNome("Leandro");
        titular.setMatricula("1234");
        titular.setIdade(60);
        titular.setSalario(8000);
        titular.setAnosInstituicao(30);

        ProfessorHorista horista = new ProfessorHorista();
        horista.setNome("Colevati");
        horista.setMatricula("5678");
        horista.setIdade(60);
        horista.setHorasAula(210);
        horista.setValorHoraAula(50);

        System.out.printf("Salário do Professor Titular: R$%.2f", titular.calculaSalario());
        System.out.printf("\nSalário do Professor Horista: R$%.2f", horista.calculaSalario());
    }
}