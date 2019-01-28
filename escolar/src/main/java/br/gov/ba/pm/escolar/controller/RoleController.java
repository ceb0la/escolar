package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.ba.pm.escolar.repository.RoleRepository;

@Controller
public class RoleController {
	
	@Autowired
	private RoleRepository objetoRepository;
	
	//Mapeamento da pagina insertRole
	@RequestMapping(value="/insertRole", method=RequestMethod.GET)
	public String form() {
		return "role/insertRole";
	}

	//Mapeamento da pagina listRole
	@RequestMapping(value="listRole", method=RequestMethod.GET)
	public String list() {
		return "role/listRole";
	}
	
}
