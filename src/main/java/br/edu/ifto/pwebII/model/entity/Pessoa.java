package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String telefone;

    @ManyToMany
    List<Endereco> enderecos;

}
