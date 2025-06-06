package br.com.catafogo.controller;

import br.com.catafogo.domain.Regiao;
import br.com.catafogo.service.RegiaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regioes")
public class RegiaoController {

    private final RegiaoService service;

    public RegiaoController(RegiaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Regiao> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Regiao criar(@RequestBody Regiao regiao) {
        return service.salvar(regiao);
    }
}