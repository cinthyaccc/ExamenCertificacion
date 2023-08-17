package modelo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class InicioControlador {
		   
		@GetMapping("/")
		public String mostrarPaginaInicio() {
		return "inicio"; // Nombre de la vista JSP (o Thymeleaf) asociada al caso de uso "Inicio"
		}
}
