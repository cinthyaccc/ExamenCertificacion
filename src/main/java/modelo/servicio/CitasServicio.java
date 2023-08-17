package modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Citas;
import modelo.repositorio.ICitasRepositorio;



@Service
public class CitasServicio {
	@Autowired
    private ICitasRepositorio citasRepo;
  
  public CitasServicio() {
       super();
    }
	
  public List<Citas> getAll(){
	  return citasRepo.findAll();
  }
	
  public Citas getOne (int id) {
	  return citasRepo.findById(id).get();
  }
  
  public void create(Citas c) {
	  citasRepo.save(c);
  }
  
  public void update(Citas c) {
	  citasRepo.save(c);
  }
  
  public void delete(int id) {
      citasRepo.deleteById(id);
  }
}
