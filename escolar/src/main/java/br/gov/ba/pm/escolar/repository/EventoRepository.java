package br.gov.ba.pm.escolar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.ba.pm.escolar.model.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String>{

}
