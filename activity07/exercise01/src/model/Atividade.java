package model;

public class Atividade {

    private String assunto;
    private int numeroPaginas;

    public Atividade() {
        super();
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "assunto='" + assunto + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
