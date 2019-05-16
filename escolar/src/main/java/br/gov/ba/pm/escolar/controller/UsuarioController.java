package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Usuario;
import br.gov.ba.pm.escolar.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarios;
	
	//Mapeamento da pagina insertUsuario
	@GetMapping("/insertUsuario")
	public String form() {
		return "usuario/insertUsuario";
	}
	
	@PostMapping("/insertUsuario")
	public String form(Usuario usuario) {
		usuarios.save(usuario);
		return "redirect:/listUsuario";
	}
	
	//Mapeamento da pagina listUsuario
	@GetMapping("/listUsuario")
	public ModelAndView listarUsuarios() {
		ModelAndView mv = new ModelAndView("/usuario/listUsuario");
		mv.addObject("usuarios", usuarios.findAll());
		mv.addObject("usuario", new Usuario());
		return mv;
	}
}