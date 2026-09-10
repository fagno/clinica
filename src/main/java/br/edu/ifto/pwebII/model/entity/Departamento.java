package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Departamento {

    @Id
    Long id;

    String nome;

    @OneToMany(mappedBy = "departamento")
    List<Funcionario> funcionaios;


}
