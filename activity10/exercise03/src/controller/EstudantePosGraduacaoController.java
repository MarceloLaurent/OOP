package controller;

import model.Estudante;

public class EstudantePosGraduacaoController extends EstudanteController{

    @Override
    public void estudar(Estudante estudante){
        System.out.println(estudante.getNome() + " está pesquisando.");
    }
}
