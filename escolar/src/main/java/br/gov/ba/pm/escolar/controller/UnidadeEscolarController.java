package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.ba.pm.escolar.model.UnidadeEscolar;
import br.gov.ba.pm.escolar.repository.UnidadeEscolarRepository;

@Controller
public class UnidadeEscolarController {
	
	@Autowired
	private UnidadeEscolarRepository objetoRepository;
	
	//Mapeamento da pagina insertUnidadeEscolar
	@RequestMapping(value="/insertUnidadeEscolar", method=RequestMethod.GET)
	public String form() {
		return "unidadeEscolar/insertUnidadeEscolar";
	}

	//Mapeamento da pagina listUnidadeEscolar
	@RequestMapping(value="listUnidadeEscolar", method=RequestMethod.GET)
	public String list() {
		return "unidadeEscolar/listUnidadeEscolar";
	}
	
	//Insert de Unidade Escolar
	@RequestMapping(value="insertUnidadeEscolar", method=RequestMethod.POST)
	public String form(UnidadeEscolar unidadeEscolar){
		objetoRepository.save(unidadeEscolar);
		return "redirect/insertUnidadeEscolar";
	}
}
