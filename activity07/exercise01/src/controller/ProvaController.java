package controller;

import model.Prova;

import java.util.ArrayList;

public class ProvaController implements IAvaliacaoController<Prova>{
    private final ArrayList<Prova> provas = new ArrayList<>();


    @Override
    public void inserir(Prova prova) {
        prova.setMedia((float)(0.01 + Math.random() * 10));
        provas.add(prova);
    }

    @Override
    public void listar() {
        for (Prova prova: provas) {
            System.out.println(prova);
        }
    }

    @Override
    public void alterar(Prova prova, int index) {
        provas.set(index, prova);
    }

    @Override
    public void excluir(Prova prova) {
        provas.remove(prova);
    }

    @Override
    public void limpar() {
        provas.clear();
    }

    @Override
    public Prova buscar(int index) {
        if(provas.size() > index){
            return provas.get(index);
        } else {
            System.out.println("Prova não encontrada");
            return null;
        }
    }
}
