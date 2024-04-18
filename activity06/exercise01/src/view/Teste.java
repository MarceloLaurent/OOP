package view;

import controller.Motor;
import controller.VeiculoCarga;
import controller.VeiculoPasseio;

public class Teste {
    public static void main(String[] args) {

        Motor dsc = new Motor(6, 360);
        Motor eaton = new Motor(8, 770);

        VeiculoPasseio mustang = new VeiculoPasseio("ADS2025", "Ford", "GT500", "Preto", 320, 4, eaton, 4);
        VeiculoCarga scania = new VeiculoCarga("ADS2024", "Scania", "113", "Branca", 140, 24, dsc, 80000,5000);

        System.out.println(mustang);
        System.out.println(scania);
    }
}