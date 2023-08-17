package modelo.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HistoriaClinicaControlador {

    @GetMapping("/historiaClinicaJSON")
    public String mostrarPaginaJSP() {
        return "historiaClinicaJSON"; // Nombre de la vista JSP sin extensión
    }
}
