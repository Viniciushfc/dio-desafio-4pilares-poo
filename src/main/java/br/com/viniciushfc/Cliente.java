package br.com.viniciushfc;

import lombok.Data;

@Data
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
