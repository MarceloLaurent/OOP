package model;

public class Parcial extends Funcionario{

    private String horaEntrada;
    private String horaSaida;

    public Parcial() {
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "Funcionário Parcial{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", salário=" + getSalario() + '\'' +
                ", entrada='" + horaEntrada + '\'' +
                ", saída='" + horaSaida + '\'' +
                '}';
    }
}

