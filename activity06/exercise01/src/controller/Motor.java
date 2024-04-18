package controller;

public class Motor {

    private int qdtPist;
    private int potencia;

    public Motor() {
        super();
    }

    public Motor(int qdtPist, int potencia) {
        this.qdtPist = qdtPist;
        this.potencia = potencia;
    }

    public int getQdtPist() {
        return qdtPist;
    }

    public final void setQdtPist(int qdtPist) {
        this.qdtPist = qdtPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public final void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "{qdtPist=" + qdtPist +
                ", potencia=" + potencia + "CV" +
                '}';
    }
}
