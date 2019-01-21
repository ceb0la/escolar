package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.ba.pm.escolar.model.Usuario;
import br.gov.ba.pm.escolar.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository objetoRepository;
	
	@RequestMapping(value="/insertUsuario", method=RequestMethod.GET)
	public String form() {
		return "usuario/insertUsuario";
	}
	
	@RequestMapping(value="/insertUsuario", method=RequestMethod.POST)
	public String form(Usuario usuario) {
		objetoRepository.save(usuario);
		return "redirect:/insertUsuario";
	}
}
