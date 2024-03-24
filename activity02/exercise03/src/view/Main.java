package view;

import controller.AgendaTelefonica;
import controller.Contato;

public class Main {
    public static void main(String[] args) {

        AgendaTelefonica agenda = new AgendaTelefonica();

        Contato contato1 = new Contato("Leandro", "(11) 99999-9999", "leandro@fatec.com");
        Contato contato2 = new Contato("Colevati", "(11) 90000-0000", "colevati@fatec.com");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        agenda.getContato("Leandro");
        agenda.getContato("Colevati");

        agenda.removerContato(contato2);

        agenda.getContato("Colevati");

    }
}