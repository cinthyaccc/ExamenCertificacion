package modelo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctoresControlador {

	  @GetMapping("/doctores")
	    public String mostrarPaginaJSP() {
	        return "doctores"; // Nombre de la vista JSP sin extensión
	    }
	}
