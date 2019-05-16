package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.UnidadeEscolar;
import br.gov.ba.pm.escolar.repository.UnidadeEscolarRepository;

@Controller
public class UnidadeEscolarController {
	
	@Autowired
	private UnidadeEscolarRepository unidadesEscolares;
	
	//Mapeamento da pagina insertUnidadeEscolar
	@GetMapping("/inserirUnidadeEscolar")
	public String form() {
		return "unidadeEscolar/inserirUnidadeEscolar";
	}
	
	//Insert Unidade Escolar
	@PostMapping("/inserirUnidadeEscolar")
	public String form(UnidadeEscolar unidadeEscolar){
		unidadesEscolares.save(unidadeEscolar);
		return "redirect:/listarUnidadeEscolar";
	}

	//Mapeamento da pagina listUnidadeEscolar
	@GetMapping("/listarUnidadeEscolar")
	public ModelAndView listarUnidadeEscolar() {
		ModelAndView mv = new ModelAndView("/unidadeEscolar/listarUnidadeEscolar");
		mv.addObject("unidadesEscolares", unidadesEscolares.findAll());
		mv.addObject("unidadeEscolar", new UnidadeEscolar());
		return mv;
	}
	
}
