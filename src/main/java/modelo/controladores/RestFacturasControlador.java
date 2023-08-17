package modelo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelo.entidad.Facturas;
import modelo.servicio.FacturasServicio;


@RestController
public class RestFacturasControlador {
	 @Autowired
	    private FacturasServicio faServicio;

	    @RequestMapping(value = "/api/facturas", headers = "Accept=application/json")
	    public List<Facturas> getFacturas() {
	        return faServicio.getAll();
	    }
	}