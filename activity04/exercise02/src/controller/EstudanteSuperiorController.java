package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudante{

    @Override
    public float percentualRendimento(Estudante estudante) {
        return estudante.getMediaNotas() * estudante.getQuantidadeAprovacoes() * 0.972f;
    }

    @Override
    public float percentualProgressao(Estudante estudante) {
        return estudante.getQuantidadeAprovacoes() / 6f;
    }
}
