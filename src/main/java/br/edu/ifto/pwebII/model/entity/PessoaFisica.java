package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public abstract class PessoaFisica extends Pessoa{

    String nome;

    String cpf;

    LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
