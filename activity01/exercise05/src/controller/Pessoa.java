package controller;

import java.io.IOException;
import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String profissao;
    private LocalDate dataNascimento;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public int getIdade() throws IOException {
        if(LocalDate.now().getYear() - this.dataNascimento.getYear() >= 150){
            throw new IOException("Data Inválida!");
        }
        if(LocalDate.now().getMonthValue() < this.dataNascimento.getMonthValue()
                || (LocalDate.now().getMonthValue() == this.dataNascimento.getMonthValue()
                && LocalDate.now().getDayOfMonth() < this.dataNascimento.getDayOfMonth())) {
            return LocalDate.now().getYear() - this.dataNascimento.getYear() - 1;
        } else {
            return LocalDate.now().getYear() - this.dataNascimento.getYear();
        }
    }
}
