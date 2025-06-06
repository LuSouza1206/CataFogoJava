package br.com.catafogo.repository;

import br.com.catafogo.domain.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegiaoRepository extends JpaRepository<Regiao, Long> {
}