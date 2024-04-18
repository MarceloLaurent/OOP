package model;

public class Integral extends Funcionario{

    private String bancoHoras;

    public Integral() {
    }

    public String getBancoHoras() {
        return bancoHoras;
    }

    public void setBancoHoras(String bancoHoras) {
        this.bancoHoras = bancoHoras;
    }

    @Override
    public String toString() {
        return "Funcionário Integral{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", salário=" + getSalario() + '\'' +
                ", banco de horas='" + bancoHoras + '\'' +
                '}';
    }
}
