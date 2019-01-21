package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.ba.pm.escolar.model.Professor;
import br.gov.ba.pm.escolar.repository.ProfessorRepository;

@Controller
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository objetoRepository;
	
	@RequestMapping(value="/insertProfessor", method=RequestMethod.GET)
	public String form() {
		return "aluno/formProfessor";
	}
	
	@RequestMapping(value="/insertProfessor", method=RequestMethod.POST)
	public String form(Professor professor) {
		objetoRepository.save(professor);
		return "redirect:/insertProfessor";
	}
}
