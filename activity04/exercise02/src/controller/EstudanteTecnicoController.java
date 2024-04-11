package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudante{
    @Override
    public float percentualRendimento(Estudante estudante) {
        return estudante.getMediaNotas() * estudante.getQuantidadeAprovacoes() * 0.931f;
    }

    @Override
    public float percentualProgressao(Estudante estudante) {
        return estudante.getQuantidadeAprovacoes() / 3f;
    }
}
