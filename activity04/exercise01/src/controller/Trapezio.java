package controller;

public class Trapezio extends Quadrilatero{

    private float baseMenor;

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public float calculaArea() {
        return (getBase() + baseMenor) * getAltura() /2;
    }
}
