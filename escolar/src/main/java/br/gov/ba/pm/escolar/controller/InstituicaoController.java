package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Instituicao;
import br.gov.ba.pm.escolar.repository.InstituicaoRepository;

@Controller
public class InstituicaoController {
	
	@Autowired
	private InstituicaoRepository instituicoes;
	
	@GetMapping("/inserirInstituicao")
	public String getInsert() {
		return "instituicao/inserirInstituicao";
	}
	
	@PostMapping("/inserirInstituicao")
	public String postInsert(Instituicao instituicao) {
		instituicoes.save(instituicao);
		return "redirect:/listarInstituicao";
	}
	
	@GetMapping("/listarInstituicao")
	public ModelAndView listarInstituicoes() {
		ModelAndView mv = new ModelAndView	("instituicao/listarInstituicao");
		mv.addObject("instituicoes", instituicoes.findAll());
		mv.addObject("instituicao", new Instituicao());
		return mv;
	}
	
	/*//Search id for instituicao and return all attributes
		@RequestMapping("/{id2}")
		public ModelAndView detalhesInstituicao(@PathVariable("id2")long id) {
			Instituicao instituicao = instituicoes.findById(id);
			ModelAndView mv = new ModelAndView	("instituicao/detalharInstituicao");
			mv.addObject("instituicao", instituicao);
			return mv;
		}*/
}
