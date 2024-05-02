package controller;

import model.Estudante;

public class EstudanteGraduacaoController extends EstudanteController implements ITrabalhoConclusaoCurso {

    @Override
    public void entregarTCC(Estudante estudante) {
        System.out.println("TCC de " + estudante.getNome() + " entregue");
    }
}
