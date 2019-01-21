package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.ba.pm.escolar.model.Aluno;
import br.gov.ba.pm.escolar.repository.AlunoRepository;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoRepository objetoRepository;
	
	@RequestMapping(value="/insertAluno", method=RequestMethod.GET)
	public String form() {
		return "aluno/insertAluno";
	}
	
	@RequestMapping(value="/insertAluno", method=RequestMethod.POST)
	public String form(Aluno aluno) {
		objetoRepository.save(aluno);
		return "redirect:/insertAluno";
	}
}
