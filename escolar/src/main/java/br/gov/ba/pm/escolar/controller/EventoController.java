package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@PostMapping("/insertEvent")
	public String form(Evento evento) {
		eventos.save(evento);
		return "redirect:/listEvent";
	}
	
	@GetMapping("/listEvent")
	public ModelAndView listarEventos() {
		ModelAndView mv = new ModelAndView	("evento/listEvent");
		mv.addObject("eventos", eventos.findAll());
		mv.addObject("evento", new Evento());
		return mv;
	}

	//When call "listEvent/" return "event/listEvent"
	/*@GetMapping("/listEvent")
	public String list() {
		return "evento/listEvent";
	}
	*/
	
	//Search id for event and return all attributes
	@RequestMapping("/{id}")
	public ModelAndView detalhesEvento(@PathVariable("id")long id) {
		Evento evento = eventos.findById(id);
		ModelAndView mv = new ModelAndView	("evento/detailsEvent");
		mv.addObject("evento", evento);
		return mv;
	}
}
