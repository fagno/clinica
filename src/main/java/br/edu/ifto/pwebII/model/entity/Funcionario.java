package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Funcionario extends PessoaFisica{



    BigDecimal salario;

    @ManyToOne
    Departamento departamento;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
