package modelo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.entidad.Doctores;
import modelo.servicio.DoctoresServicio;

@RestController
public class RestDoctoresControlador {
    @Autowired
    private DoctoresServicio doctoresServicio;

    @RequestMapping(value = "/api/doctores", headers = "Accept=application/json")
    public List<Doctores> getDoctores() {
        return doctoresServicio.getAll();
    }
}
