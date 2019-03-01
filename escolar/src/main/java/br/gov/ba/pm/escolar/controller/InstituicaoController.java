package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Evento;
import br.gov.ba.pm.escolar.model.Instituicao;
import br.gov.ba.pm.escolar.repository.InstituicaoRepository;

@Controller
public class InstituicaoController {
	
	@Autowired
	private InstituicaoRepository instituicoes;
	
	@GetMapping("/insertInstituicao")
	public String getInsert() {
		return "instituicao/insertInstituicao";
	}
	
	@PostMapping("/insertInstituicao")
	public String postInsert(Instituicao instituicao) {
		instituicoes.save(instituicao);
		return "redirect:/listInstituicao";
	}
	
	@GetMapping("/listInstituicao")
	public ModelAndView listarInstituicoes() {
		ModelAndView mv = new ModelAndView	("instituicao/listInstituicao");
		mv.addObject("instituicoes", instituicoes.findAll());
		mv.addObject("instituicao", new Instituicao());
		return mv;
	}
}
