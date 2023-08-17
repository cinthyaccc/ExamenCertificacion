package modelo.servicio;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import modelo.entidad.Doctores;

import modelo.repositorio.IDoctoresRepositorio;



@Service
public class DoctoresServicio {
	@Autowired
    private IDoctoresRepositorio drRepo;
  
  public DoctoresServicio() {
       super();
    }
	
  public List<Doctores> getAll(){
	  return drRepo.findAll();
  }

  @Transactional
  public Doctores getOne (int id) {
	  return drRepo.findById(id).get();
  }
  @Transactional
  public void create(Doctores dr) {
	  drRepo.save(dr);
  }
  @Transactional
  public void update(Doctores dr) {
	  drRepo.save(dr);
}
}