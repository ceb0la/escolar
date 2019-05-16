package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Role;
import br.gov.ba.pm.escolar.repository.RoleRepository;

@Controller
public class RoleController {
	
	@Autowired
	private RoleRepository roles;
	
	//When call "/insertRole" return "event/insertEvent"
	@GetMapping("/insertRole")
	public String form() {
		return "role/insertRole";
	}
	
	//Insert Role
	@PostMapping("/insertRole")
	public String form(Role role) {
		roles.save(role);
		return "redirect:/listRole";
	}
	
	//Mapeamento da pagina listRole e retorno da lista
	@GetMapping("listRole")
	public ModelAndView listarRoles() {
		ModelAndView mv = new ModelAndView("/role/listRole");
		mv.addObject("roles", roles.findAll());
		mv.addObject("role", new Role());
		return mv;
	}
	
}
