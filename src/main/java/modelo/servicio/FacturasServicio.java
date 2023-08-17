package modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import modelo.entidad.Facturas;

import modelo.repositorio.IFacturasRepositorio;

@Service
public class FacturasServicio {
	@Autowired
    private IFacturasRepositorio faRepo;
  
  public FacturasServicio() {
       super();
    }
	
  public List<Facturas> getAll(){
	  return faRepo.findAll();
  }
	
  public Facturas getOne (int id) {
	  return faRepo.findById(id).get();
  }
  
  public void create(Facturas fa) {
	  faRepo.save(fa);
  }
  
  public void update(Facturas fa) {
	  faRepo.save(fa);
}
}