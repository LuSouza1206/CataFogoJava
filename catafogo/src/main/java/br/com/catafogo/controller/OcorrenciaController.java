package br.com.catafogo.controller;

import br.com.catafogo.domain.Ocorrencia;
import br.com.catafogo.service.OcorrenciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    private final OcorrenciaService service;

    public OcorrenciaController(OcorrenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ocorrencia> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Ocorrencia criar(@RequestBody Ocorrencia ocorrencia) {
        return service.salvar(ocorrencia);
    }
}