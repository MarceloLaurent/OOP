package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Main {
    public static void main(String[] args) {

        AtividadeController ac = new AtividadeController();
        ProvaController pc = new ProvaController();

        Atividade poo = new Atividade();
        poo.setAssunto("Abstração");
        poo.setNumeroPaginas(30);

        Prova oop = new Prova();
        oop.setNumeroQuestoes(5);

        ac.inserir(poo);
        pc.inserir(oop);

        System.out.println(ac.buscar(0));
        System.out.println(pc.buscar(0));
    }
}