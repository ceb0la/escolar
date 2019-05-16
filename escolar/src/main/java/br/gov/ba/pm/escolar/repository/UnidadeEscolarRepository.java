package br.gov.ba.pm.escolar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.ba.pm.escolar.model.UnidadeEscolar;

@Repository
public interface UnidadeEscolarRepository extends CrudRepository<UnidadeEscolar, String>{
	UnidadeEscolar findById(long id);
}
