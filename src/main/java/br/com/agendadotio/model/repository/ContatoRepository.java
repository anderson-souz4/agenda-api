package br.com.agendadotio.model.repository;

import br.com.agendadotio.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
