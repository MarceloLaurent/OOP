package controller;

import model.Atividade;
import model.Prova;

import java.util.ArrayList;

public class AtividadeController implements IAvaliacaoController<Atividade> {

    private final ArrayList<Atividade> atividades = new ArrayList<>();

    @Override
    public void inserir(Atividade atividade) {
        atividades.add(atividade);
    }

    @Override
    public void listar() {
        for (Atividade atividade: atividades) {
            System.out.println(atividade);
        }
    }

    @Override
    public void alterar(Atividade atividade, int index) {
        atividades.set(index, atividade);
    }

    @Override
    public void excluir(Atividade atividade) {
        atividades.remove(atividade);
    }

    @Override
    public void limpar() {
        atividades.clear();
    }

    @Override
    public Atividade buscar(int index) {
        if(atividades.size() > index){
            return atividades.get(index);
        } else {
            System.out.println("Atividade não encontrada");
            return null;
        }
    }
}
