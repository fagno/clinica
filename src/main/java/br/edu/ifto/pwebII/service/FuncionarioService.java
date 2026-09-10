package br.edu.ifto.pwebII.service;

import br.edu.ifto.pwebII.model.repository.FuncionarioRepository;
import jakarta.persistence.PersistenceException;
import jakarta.transaction.Transactional;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Boolean remover(Long id) {
        try {
            repository.remove(id);
            return true;
        } catch (PersistenceException e) {
            return false;
        }
    }


}
