package br.edu.ifto.pwebII.model.repository;

import br.edu.ifto.pwebII.model.entity.Funcionario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FuncionarioRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Funcionario> funcionarios(){
        Query query = em.createQuery("from Funcionario"); //Linguagem HQL
        return query.getResultList();
    }
}
