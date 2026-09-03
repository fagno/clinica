package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String logradouro;

    @ManyToMany(mappedBy = "enderecos")
    List<Pessoa> pessoas;

}
