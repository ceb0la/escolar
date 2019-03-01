package br.gov.ba.pm.escolar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstituicaoController {
	
	@GetMapping("/insertInstituicao")
	public String getInsert() {
		return "instituicao/insertInstituicao";
	}
	
	@GetMapping("/listInstituicao")
	public String getList() {
		return "instituicao/listInstituicao";
	}
}
