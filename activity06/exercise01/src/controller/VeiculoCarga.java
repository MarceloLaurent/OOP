package controller;

public final class VeiculoCarga extends Veiculo{

    private int cargaMax;
    private int tara;

    public VeiculoCarga() {
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public VeiculoCarga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor, int cargaMax, int tara) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "VeiculoCarga{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", velocMax=" + getVelocMax() * 100000+ "cm/h" +
                ", qtdRodas=" + getQtdRodas() +
                ", motor=" + getMotor() +
                ", cargaMax=" + cargaMax + "Kg" +
                ", tara=" + tara + "Kg" +
                '}';
    }
}
