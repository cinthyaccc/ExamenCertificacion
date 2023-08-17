package modelo.servicio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
  @Transactional
  public HistoriaClinica getOne (int id) {
	  return hiRepo.findById(id).get();
  }
  @Transactional
  public void create(HistoriaClinica hi) {
	  hiRepo.save(hi);
  }
  @Transactional
  public void update(HistoriaClinica hi) {
	  hiRepo.save(hi);
  }
  public List<HistoriaClinica> getPaginatedHistoriaClinica(int pageIndex, int pageSize) {
      int offset = pageIndex * pageSize;
      return hiRepo.getPaginatedHistoriaClinica(pageSize, offset);
  }




}
