package br.com.catafogo.controller;

import br.com.catafogo.domain.AgenteAmbiental;
import br.com.catafogo.service.AgenteAmbientalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agentes")
public class AgenteAmbientalController {

    private final AgenteAmbientalService service;

    public AgenteAmbientalController(AgenteAmbientalService service) {
        this.service = service;
    }

    @GetMapping
    public List<AgenteAmbiental> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public AgenteAmbiental criar(@RequestBody AgenteAmbiental agente) {
        return service.salvar(agente);
    }
}