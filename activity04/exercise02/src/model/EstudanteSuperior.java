package model;

public class EstudanteSuperior extends Estudante{

    private String instituicaoSegundoGrau;
    private int anoConclusaoSegundoGrau;

    public EstudanteSuperior() {
        super();
    }

    public EstudanteSuperior(String nome, String ra, String email, float mediaNotas, int quantidadeAprovacoes, String instituicaoSegundoGrau, int anoConclusaoSegundoGrau) {
        super(nome, ra, email, mediaNotas, quantidadeAprovacoes);
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    public String getInstituicaoSegundoGrau() {
        return instituicaoSegundoGrau;
    }

    public void setInstituicaoSegundoGrau(String instituicaoSegundoGrau) {
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
    }

    public int getAnoConclusaoSegundoGrau() {
        return anoConclusaoSegundoGrau;
    }

    public void setAnoConclusaoSegundoGrau(int anoConclusaoSegundoGrau) {
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }
}
