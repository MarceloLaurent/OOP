package view;

import controller.Circulo;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(1);

        System.out.println("Perímetro: " + circulo.getPerimetro());
        System.out.println("Área: " + circulo.getArea());
    }
}