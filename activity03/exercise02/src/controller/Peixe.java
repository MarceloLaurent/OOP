package controller;

public class Peixe extends Animal{

    public String caracteristica;

    public Peixe() {
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
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
                ", característica='" + caracteristica + '\'' +
                '}');
    }
}
