package br.com.catafogo.repository;

import br.com.catafogo.domain.AgenteAmbiental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenteAmbientalRepository extends JpaRepository<AgenteAmbiental, Long> {
}