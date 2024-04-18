package controller;

import model.Funcionario;
import model.Integral;
import model.Parcial;
import model.Temporario;

import java.util.Scanner;

public class FuncionarioFactory {

    public Integral contratarFuncionarioIntegral(){
        Integral integral = new Integral();

        cadastrarDadosGerais(integral);

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o banco de horas do Funcionário: ");
        integral.setBancoHoras(scan.next());

        return integral;
    }

    public Parcial contratarFuncionarioParcial(){
        Parcial parcial = new Parcial();

        cadastrarDadosGerais(parcial);

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a hora de entrada do Funcionário: ");
        parcial.setHoraEntrada(scan.next());
        System.out.println("Informe a hora de saída do Funcionário: ");
        parcial.setHoraSaida(scan.next());

        return parcial;
    }

    public Temporario contratrarFuncionarioTemporario(){
        Temporario temporario = new Temporario();

        cadastrarDadosGerais(temporario);

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a data do final do contratato (dd/mm/aaaa): ");
        String []input = scan.next().split("/");
        temporario.setDiaFimContrado(Integer.parseInt(input[0]));
        temporario.setMesFimContrado(Integer.parseInt(input[1]));
        temporario.setAnoFimContrado(Integer.parseInt(input[2]));

        return temporario;
    }

    public void cadastrarDadosGerais(Funcionario funcionario){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o código do Funcionário: ");
        funcionario.setId(scan.next());
        System.out.println("Informe o nome do Funcionário: ");
        funcionario.setNome(scan.next());
        System.out.println("Informe o salário do Funcionário: ");
        funcionario.setSalario(scan.nextFloat());
    }
}
