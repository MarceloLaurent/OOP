package view;

import controller.Ingresso;
import controller.IngressoVIP;

public class Main {
    public static void main(String[] args) {

        float taxa = 20f;

        Ingresso ingresso = new Ingresso();
        ingresso.setIdentificador("1234");
        ingresso.setValor(90f);

        IngressoVIP vip = new IngressoVIP();
        vip.setIdentificador("5678");
        vip.setValor(90f);

        System.out.printf("O valor do ingresso é: R$%.2f", ingresso.valorFinal(taxa));
        System.out.printf("\nO valor do ingresso VIP é: R$%.2f", vip.valorVIP(taxa));

    }
}