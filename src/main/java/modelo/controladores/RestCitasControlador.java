package modelo.controladores;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import modelo.entidad.Citas;
import modelo.entidad.HistoriaClinica;
import modelo.servicio.CitasServicio;
import modelo.servicio.HistoriaClinicaServicio;

@RestController

public class RestCitasControlador {
	 @Autowired
	    private CitasServicio cServicio;

	 @RequestMapping(value = "/api/Citas", headers = "Accept=application/json")
	    public List<Citas> getCitas(){
	          
	       return cServicio.getAll();
	    }

}
