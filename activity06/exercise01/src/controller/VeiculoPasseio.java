package controller;

public final class VeiculoPasseio extends Veiculo{

    private int qdtPassageiros;

    public VeiculoPasseio() {
    }

    public VeiculoPasseio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor, int qdtPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.qdtPassageiros = qdtPassageiros;
    }

    public int getQdtPassageiros() {
        return qdtPassageiros;
    }

    public final void setQdtPassageiros(int qdtPassageiros) {
        this.qdtPassageiros = qdtPassageiros;
    }

    @Override
    public String toString() {
        return "VeiculoPasseio{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", velocMax=" + getVelocMax() * 1000 + "m/h" +
                ", qtdRodas=" + getQtdRodas() +
                ", motor=" + getMotor() +
                ", qdtPassageiros=" + qdtPassageiros +
                '}';
    }
}
