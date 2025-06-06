package br.com.catafogo.service;

import br.com.catafogo.domain.Regiao;
import br.com.catafogo.repository.RegiaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegiaoService {

    private final RegiaoRepository repository;

    public RegiaoService(RegiaoRepository repository) {
        this.repository = repository;
    }

    public List<Regiao> listarTodos() {
        return repository.findAll();
    }

    public Regiao salvar(Regiao regiao) {
        return repository.save(regiao);
    }
}