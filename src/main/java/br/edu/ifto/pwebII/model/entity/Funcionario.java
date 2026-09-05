package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Funcionario extends PessoaFisica{



    BigDecimal salario;

}
