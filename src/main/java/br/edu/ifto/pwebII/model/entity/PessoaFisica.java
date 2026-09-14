package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public abstract class PessoaFisica extends Pessoa{

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private String email;

    String carteiraNacional;

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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarteiraNacional() {
        return carteiraNacional;
    }

    public void setCarteiraNacional(String carteiraNacional) {
        this.carteiraNacional = carteiraNacional;
    }
}
