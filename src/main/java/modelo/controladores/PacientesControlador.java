package modelo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacientesControlador {

	  @GetMapping("/pacientes")
	    public String mostrarPaginaJSP() {
	        return "pacientes"; // Nombre de la vista JSP sin extensión
	    }
	}
