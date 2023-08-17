package modelo.servicio;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.HistoriaClinica;
import modelo.repositorio.IHistoriaClinicaRepositorio;

@Service
public class HistoriaClinicaServicio {

    private final IHistoriaClinicaRepositorio hiRepo;

    @Autowired
    public HistoriaClinicaServicio(IHistoriaClinicaRepositorio hiRepo) {
        this.hiRepo = hiRepo;
    }

    public List<HistoriaClinica> getAll() {
        return hiRepo.findAll();
    }

    @Transactional
    public HistoriaClinica getOne(int id) {
        return hiRepo.findById(id).orElse(null);
    }

    @Transactional
    public void create(HistoriaClinica hi) {
        hiRepo.save(hi);
    }

    @Transactional
    public void update(HistoriaClinica hi) {
        HistoriaClinica existingHi = hiRepo.findById(hi.getID()).orElse(null);
        if (existingHi != null) {
            // Actualiza las propiedades de existingHi con las propiedades de hi
            existingHi.setFecha(hi.getFecha());
            existingHi.setSintomas(hi.getSintomas());
            existingHi.setDiagnostico(hi.getDiagnostico());
            existingHi.setTratamiento(hi.getTratamiento());
            existingHi.setPaciente(hi.getPaciente());
            existingHi.setDoctor(hi.getDoctor());

            hiRepo.save(existingHi);
        }
    }

    // Asegúrate de que el método getPaginatedHistoriaClinica esté definido en el repositorio
    public List<HistoriaClinica> getPaginatedHistoriaClinica(int pageIndex, int pageSize) {
        int offset = pageIndex * pageSize;
        return hiRepo.getPaginatedHistoriaClinica(pageSize, offset);
    }
}
