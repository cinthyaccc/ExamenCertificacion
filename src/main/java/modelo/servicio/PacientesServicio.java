package modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import modelo.entidad.Pacientes;

import modelo.repositorio.IPacientesRepositorio;

@Service
public class PacientesServicio {
	@Autowired
    private IPacientesRepositorio paRepo;
  
  public PacientesServicio() {
       super();
    }
	
  public List<Pacientes> getAll(){
	  return paRepo.findAll();
  }
	
  public Pacientes getOne (int id) {
	  return paRepo.findById(id).get();
  }
  
  public void create(Pacientes pa) {
	  paRepo.save(pa);
  }
  
  public void update(Pacientes pa) {
	  paRepo.save(pa);
  }
}

