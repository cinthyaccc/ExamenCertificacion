package modelo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import modelo.entidad.HistoriaClinica;
import modelo.servicio.HistoriaClinicaServicio;

@RestController
public class RestHistoriaClinicaControlador {
    @Autowired
    private HistoriaClinicaServicio hcServicio;

    @GetMapping(value = "/api/HistoriaClinica", headers = "Accept=application/json")
    public List<HistoriaClinica> getHistoriaClinica(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit) {
        // Calcula el índice de inicio para la paginación
        int startIndex = (page - 1) * limit;

        // Obtiene la página de datos utilizando el servicio de HistoriaClinica
        List<HistoriaClinica> historiaClinicaPage = hcServicio.getPaginatedHistoriaClinica(startIndex, limit);

        return historiaClinicaPage;
    }
}
