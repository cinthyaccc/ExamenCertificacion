package modelo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import modelo.entidad.HistoriaClinica;
import modelo.servicio.HistoriaClinicaServicio;


@Controller
public class HistoriaClinicaControlador {
	@Autowired
	private HistoriaClinicaServicio hc;
	
	
	@GetMapping("/ListarVisitas")
	public ModelAndView listarHistoriaClinica() {
	    List<HistoriaClinica> usuarios = hc.getAll();

		ModelAndView modelAndView = new ModelAndView("hitoriaClinica", "historiaClinica", usuarios);
        
        return modelAndView;
	}

}