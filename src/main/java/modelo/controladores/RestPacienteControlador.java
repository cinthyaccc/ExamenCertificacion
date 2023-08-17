package modelo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelo.entidad.Pacientes;

import modelo.servicio.PacientesServicio;

@RestController
public class RestPacienteControlador {
	 @Autowired
	    private PacientesServicio paServicio;

	 @RequestMapping(value = "/api/pacientes", headers = "Accept=application/json")
	    public List<Pacientes> getCitas(){
	          
	       return paServicio.getAll();
	    }

}
