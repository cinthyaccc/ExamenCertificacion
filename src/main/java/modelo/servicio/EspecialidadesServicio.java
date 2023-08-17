package modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Doctores;
import modelo.entidad.Especialidades;
import modelo.repositorio.IDoctoresRepositorio;
import modelo.repositorio.IEspecialidadesRepositorio;

@Service
public class EspecialidadesServicio {
	@Autowired
    private IEspecialidadesRepositorio esRepo;
  
  public EspecialidadesServicio() {
       super();
    }
	
  public List<Especialidades> getAll(){
	  return esRepo.findAll();
  }
	
  public Especialidades getOne (int id) {
	  return esRepo.findById(id).get();
  }
  
  public void create(Especialidades es) {
	  esRepo.save(es);
  }
  
  public void update(Especialidades es) {
	  esRepo.save(es);
}
}
