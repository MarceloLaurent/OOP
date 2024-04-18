package model;

public class Prova {

    private int numeroQuestoes;
    private float media;

    public Prova() {
        super();
    }

    public int getNumeroQuestoes() {
        return numeroQuestoes;
    }

    public void setNumeroQuestoes(int numeroQuestoes) {
        this.numeroQuestoes = numeroQuestoes;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Prova{" +
                "numeroQuestoes=" + numeroQuestoes +
                ", media=" + media +
                '}';
    }
}
