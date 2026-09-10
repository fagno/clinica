package br.edu.ifto.pwebII.model.entity;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Paciente extends PessoaFisica{
    private String pronturario;

    public String getPronturario() {
        return pronturario;
    }

    public void setPronturario(String pronturario) {
        this.pronturario = pronturario;
    }
}
