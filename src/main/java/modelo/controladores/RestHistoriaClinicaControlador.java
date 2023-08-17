package modelo.controladores;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import modelo.entidad.HistoriaClinica;
import modelo.servicio.HistoriaClinicaServicio;

@RestController
public class RestHistoriaClinicaControlador {
    @Autowired
    private HistoriaClinicaServicio hcServicio;

    @GetMapping(value = "/api/HistoriaClinica", headers = "Accept=application/json")
    @Transactional
    public List<HistoriaClinica> getHistoriaClinica(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit) {
        // Calcula el índice de inicio para la paginación
        int startIndex = (page - 1) * limit;

        // Obtiene la página de datos utilizando el servicio de HistoriaClinica
        List<HistoriaClinica> historiaClinicaPage = hcServicio.getPaginatedHistoriaClinica(startIndex, limit);

        return historiaClinicaPage;
    }
    
    
    @PostMapping("/api/HistoriaClinica")
    @Transactional
    @ResponseBody
    public ResponseEntity<String> agregarHistoriaClinica(@RequestBody HistoriaClinica nuevaHistoriaClinica) {
        try {
            // Aquí realizas la lógica para guardar la nueva historia clínica en la base de datos
            hcServicio.create(nuevaHistoriaClinica);

            return ResponseEntity.ok("Historia clínica agregada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar historia clínica");
        }
    }
}
