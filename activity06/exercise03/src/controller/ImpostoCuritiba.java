package controller;

import java.util.Scanner;

public class ImpostoCuritiba implements IImposto{
    @Override
    public float calculaImposto() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a área total: ");
        float area = scan.nextFloat();

        float imposto = area * 5;

        System.out.println("Informe a idade: ");
        int idade = scan.nextInt();
        if(idade > 50){
            imposto += idade * 3;
        } else if (idade < 20) {
            imposto += idade * 2;
        } else {
            imposto += idade * 2.5f;
        }

        return imposto;
    }
}
