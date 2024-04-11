package controller;

public class Paralelograma extends Quadrilatero{

    @Override
    public float calculaArea() {
        return getBase() * getAltura();
    }
}
