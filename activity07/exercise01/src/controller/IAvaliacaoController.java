package controller;

public interface IAvaliacaoController<T>{

    public void inserir(T t);

    public void listar();

    public void alterar(T t, int index);

    public void excluir(T t);

    public void limpar();

    public T buscar( int index);
}
