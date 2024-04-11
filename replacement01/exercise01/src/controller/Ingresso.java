package controller;

public class Ingresso {

    private String identificador;
    private float valor;

    public Ingresso() {
        super();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public  float valorFinal(float taxa){
        return valor + taxa;
    }
}
