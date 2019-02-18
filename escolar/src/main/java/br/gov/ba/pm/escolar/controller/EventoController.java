package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Evento;
import br.gov.ba.pm.escolar.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository eventos;
	
	//When call "insertEvent/" return "event/insertEvent"
	@GetMapping("/insertEvent")
	public String form() {
		return "evento/insertEvent";
	}
	//When call "listEvent/" return "event/listEvent"
	/*@GetMapping("/listEvent")
	public String list() {
		return "evento/listEvent";
	}
	*/
	@GetMapping("/listEvent")
	public ModelAndView listarEventos() {
		ModelAndView mv = new ModelAndView	("evento/listEvent");
		mv.addObject("eventos", eventos.findAll());
		mv.addObject("evento", new Evento());
		return mv;
	}
	
	@PostMapping("/insertEvent")
	public String form(Evento evento) {
		eventos.save(evento);
		return "redirect:/insertEvent";
	}
}
