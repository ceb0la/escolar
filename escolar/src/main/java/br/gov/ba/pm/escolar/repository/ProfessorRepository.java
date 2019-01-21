package br.gov.ba.pm.escolar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.ba.pm.escolar.model.Professor;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, String> {

}
