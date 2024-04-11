package controller;

public class Mamifero extends Animal{

    public String alimento;

    public Mamifero() {
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados(){
        System.out.println( "Animal{" +
                "nome='" + getNome() + '\'' +
                ", comprimento=" + getComprimento() + " cm" +
                ", patas=" + getPatas() +
                ", cor='" + getCor() + '\'' +
                ", ambiente='" + getAmbiente()+ '\'' +
                ", velocidade=" + getVelocidade() + " m/s" +
                ", alimento='" + alimento + '\'' +
                '}');
    }
}
