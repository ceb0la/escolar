package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Professor;
import br.gov.ba.pm.escolar.repository.ProfessorRepository;

@Controller
@RequestMapping("professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository professores;
	
	////Mapeamento da pagina insertProfessor
	@GetMapping("/insertProfessor")
	public String form() {
		return "professor/insertProfessor";
	}
	
	//POST do formulario insertProfessor
	@PostMapping("/insertProfessor")
	public String form(Professor professor) {
		professores.save(professor);
		return "redirect:/insertProfessor";
	}
	
	//Mapeamento da pagina listProfessor
	@GetMapping("/listProfessor")
	public ModelAndView listarProfessor() {
		ModelAndView mv = new ModelAndView("professor/listProfessor");
		mv.addObject("professores", professores.findAll());
		mv.addObject("professor", new Professor());
		return mv;
	}
}
