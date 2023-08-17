package modelo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FacturasControlador {

 @GetMapping("/facturas")
public String mostrarPaginaJSP() {
    return "facturas"; // Nombre de la vista JSP sin extensión
}
}
