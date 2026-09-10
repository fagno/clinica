package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public abstract class PessoaFisica extends Pessoa{

    String nome;

    String cpf;

    LocalDate dataNascimento;

}
