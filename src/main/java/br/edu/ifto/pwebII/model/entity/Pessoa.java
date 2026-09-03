package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nome;

    String teleone;

    //OneToOne
    //OneToMany
    //ManyToOne
    //ManyToMany

    @ManyToMany
    List<Endereco> enderecos;

}
