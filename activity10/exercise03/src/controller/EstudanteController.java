package controller;

import model.Estudante;

public class EstudanteController {

    public void estudar(Estudante estudante){
        System.out.println(estudante.getNome() + " está estudando.");
    }
}
