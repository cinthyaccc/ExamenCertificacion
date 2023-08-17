package modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import modelo.entidad.HistoriaClinica;

import modelo.repositorio.IHistoriaClinicaRepositorio;

@Service
public class HistoriaClinicaServicio {
	@Autowired
    private IHistoriaClinicaRepositorio hiRepo;
  
  public HistoriaClinicaServicio() {
       super();
    }
	
  public List<HistoriaClinica> getAll(){
	  return hiRepo.findAll();
  }
	
  public HistoriaClinica getOne (int id) {
	  return hiRepo.findById(id).get();
  }
  
  public void create(HistoriaClinica hi) {
	  hiRepo.save(hi);
  }
  
  public void update(HistoriaClinica hi) {
	  hiRepo.save(hi);
  }
}
