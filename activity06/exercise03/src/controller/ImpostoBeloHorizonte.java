package controller;

import java.util.Scanner;

public class ImpostoBeloHorizonte implements IImposto{
    @Override
    public float calculaImposto() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a área total: ");
        float area = scan.nextFloat();
        System.out.println("Informe o número de quartos: ");
        int comodo = scan.nextInt();

        return area * 7 + comodo * 4;
    }
}
