package controller;

import java.util.Scanner;

public class ImpostoPortoAlegre implements IImposto{
    @Override
    public float calculaImposto() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a área total: ");
        float area = scan.nextFloat();

        System.out.println("Possui garagem: (1-Sim / 2-NÂO) ?");
        int opc = scan.nextInt();
        if(opc == 1){
            System.out.println("Informe a área da garagem: ");
            float garagem = scan.nextFloat();

            return area * 7.5f + garagem * 2.5f;
        } else {
            return area * 8;
        }
    }
}
