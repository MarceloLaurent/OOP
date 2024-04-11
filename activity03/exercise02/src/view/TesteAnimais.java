package view;

import controller.Animal;
import controller.Mamifero;
import controller.Peixe;

public class TesteAnimais {
    public static void main(String[] args) {

        Animal camelo = new Animal();

        camelo.alteraNome("Camelo");
        camelo.alteraComprimento(150);
        camelo.alteraPatas(4);
        camelo.alteraCor("Amarelo");
        camelo.alteraAmbiente("Terra");
        camelo.alteraVelocidade(2);

        Peixe tubarao = new Peixe();

        tubarao.alteraNome("Tubarão");
        tubarao.alteraComprimento(300);
        tubarao.alteraPatas(0);
        tubarao.alteraCor("Cinzento");
        tubarao.alteraAmbiente("Mar");
        tubarao.alteraVelocidade(1.5f);
        tubarao.alteraCaracteristica("Barbatanas e cauda");

        Mamifero urso = new Mamifero();

        urso.alteraNome("Zé Colmeia");
        urso.alteraComprimento(180);
        urso.alteraPatas(4);
        urso.alteraCor("Vermelho");
        urso.alteraAmbiente("Terra");
        urso.alteraVelocidade(0.5f);
        urso.alteraAlimento("Mel");

        camelo.dados();
        tubarao.dados();
        urso.dados();
    }
}