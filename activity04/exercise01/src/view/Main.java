package view;

import controller.Paralelograma;
import controller.Trapezio;

public class Main {
    public static void main(String[] args) {

        Paralelograma paralelograma = new Paralelograma();
        paralelograma.setBase(20);
        paralelograma.setAltura(10);

        Trapezio trapezio = new Trapezio();
        trapezio.setBase(20);
        trapezio.setBaseMenor(10);
        trapezio.setAltura(10);

        System.out.println("Área do Paralelograma: " + paralelograma.calculaArea());
        System.out.println("Área do Trapézio: " + trapezio.calculaArea());
    }
}