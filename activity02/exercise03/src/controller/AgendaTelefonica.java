package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AgendaTelefonica {

    private final List<Contato> contatos = new ArrayList<>();

    public AgendaTelefonica() {
    }

    public void getContato(String nome){
        String result = "Contato não encontrado...";
        for(Contato value : contatos) {
            if (Objects.equals(value.getNome(), nome)) {
                result = value.toString();
            }
        }

        System.out.println(result);
    }

    public void adicionarContato (Contato contato){
        contatos.add(contato);
    }

    public void removerContato (Contato contato){
        contatos.remove(contato);
    }
}
