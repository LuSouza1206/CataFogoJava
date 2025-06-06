package br.com.catafogo.service;

import br.com.catafogo.domain.AgenteAmbiental;
import br.com.catafogo.repository.AgenteAmbientalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteAmbientalService {

    private final AgenteAmbientalRepository repository;

    public AgenteAmbientalService(AgenteAmbientalRepository repository) {
        this.repository = repository;
    }

    public List<AgenteAmbiental> listarTodos() {
        return repository.findAll();
    }

    public AgenteAmbiental salvar(AgenteAmbiental agente) {
        return repository.save(agente);
    }
}