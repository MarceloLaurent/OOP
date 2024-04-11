package controller;

public class IngressoVIP extends Ingresso{


    public float valorVIP(float taxa) {
        return valorFinal(taxa) * 1.18f;
    }
}
