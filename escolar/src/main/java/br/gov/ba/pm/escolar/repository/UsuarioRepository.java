package br.gov.ba.pm.escolar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.ba.pm.escolar.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String>{
	Usuario findByLogin(String login);

}
