package view;

import controller.ImpostoBeloHorizonte;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("===================");
        System.out.println("Selecione a cidade:");
        System.out.println("1 - Belo Horizonte");
        System.out.println("2 - Curitiba");
        System.out.println("3 - Porto Alegre");
        System.out.println("4 - São Paulo");
        System.out.println("0 - Cancelar");
        System.out.println("===================");

        Scanner scan = new Scanner(System.in);
        int opc = scan.nextInt();

        switch (opc){
            case 1:
                ImpostoBeloHorizonte b = new ImpostoBeloHorizonte();
                System.out.printf("Imposto total: %.2f", b.calculaImposto());
                break;
            case 2:
                ImpostoCuritiba c = new ImpostoCuritiba();
                System.out.printf("Imposto total: %.2f", c.calculaImposto());
                break;
            case 3:
                ImpostoPortoAlegre p = new ImpostoPortoAlegre();
                System.out.printf("Imposto total: %.2f", p.calculaImposto());
                break;
            case 4:
                ImpostoSaoPaulo s = new ImpostoSaoPaulo();
                System.out.printf("Imposto total: %.2f", s.calculaImposto());
                break;
            case 0:
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}