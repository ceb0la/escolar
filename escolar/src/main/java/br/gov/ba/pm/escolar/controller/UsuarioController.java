package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.gov.ba.pm.escolar.model.Usuario;
import br.gov.ba.pm.escolar.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository objetoRepository;
	
	//Mapeamento da pagina insertUsuario
	@GetMapping(value="/insertUsuario")
	public String form() {
		return "usuario/insertUsuario";
	}

	//Mapeamento da pagina listUsuario
	@GetMapping(value="listUsuario")
	public String list() {
		return "usuario/listUsuario";
	}
	
	@PostMapping(value="/insertUsuario")
	public String form(Usuario usuario) {
		objetoRepository.save(usuario);
		return "redirect:/insertUsuario";
	}
}
