package model;

public class Temporario extends Funcionario{

    private int diaFimContrado;
    private int mesFimContrado;
    private int anoFimContrado;

    public Temporario() {
    }

    public int getDiaFimContrado() {
        return diaFimContrado;
    }

    public void setDiaFimContrado(int diaFimContrado) {
        this.diaFimContrado = diaFimContrado;
    }

    public int getMesFimContrado() {
        return mesFimContrado;
    }

    public void setMesFimContrado(int mesFimContrado) {
        this.mesFimContrado = mesFimContrado;
    }

    public int getAnoFimContrado() {
        return anoFimContrado;
    }

    public void setAnoFimContrado(int anoFimContrado) {
        this.anoFimContrado = anoFimContrado;
    }

    @Override
    public String toString() {
        return "Funcionário Temporario{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", salário=" + getSalario() + '\'' +
                ", data final contrado=" + diaFimContrado +
                "/" + mesFimContrado +
                "/" + anoFimContrado +
                '}';
    }
}

