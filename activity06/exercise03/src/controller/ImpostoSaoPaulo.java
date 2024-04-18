package controller;

import java.util.Scanner;

public class ImpostoSaoPaulo implements IImposto{
    @Override
    public float calculaImposto() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a área total: ");
        float area = scan.nextFloat();
        System.out.println("Informe o número de cômodos: ");
        int comodo = scan.nextInt();

        return area * 10 + comodo * 2;
    }
}
