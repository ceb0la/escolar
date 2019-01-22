package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Evento;
import br.gov.ba.pm.escolar.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository objetoRepository;
	
	//Mapeamento da pagina insertEvento
	@RequestMapping(value="/insertEvento", method=RequestMethod.GET)
	public String form() {
		return "evento/insertEvento";
	}
	//Mapeamento da pagina listEvento
	@RequestMapping(value="/listEvento", method=RequestMethod.GET)
	public String list() {
		return "evento/listEvento";
	}
	
	@RequestMapping(value="/insertEvento", method=RequestMethod.POST)
	public String form(Evento evento) {
		objetoRepository.save(evento);
		return "redirect:/insertEvento";
	}
	
	@RequestMapping("/listEvento")
	public ModelAndView listarEventos() {
		ModelAndView mv = new ModelAndView	("listEvento");
		Iterable<Evento> eventos = objetoRepository.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
}
