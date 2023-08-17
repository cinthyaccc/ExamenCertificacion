package modelo.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import modelo.entidad.Citas;

@Controller
public class CitasControlador {

	
	 @GetMapping("/citas")
	    public String mostrarPaginaJSP() {
	        return "citas"; // Nombre de la vista JSP sin extensión
	    }

}
