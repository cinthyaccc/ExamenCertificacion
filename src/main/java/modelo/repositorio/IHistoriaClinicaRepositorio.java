package modelo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import modelo.entidad.HistoriaClinica;

@Repository
public interface IHistoriaClinicaRepositorio extends JpaRepository<HistoriaClinica, Integer> {
	 @Query(value = "SELECT * FROM historia_clinica ORDER BY ID ASC LIMIT ?1 OFFSET ?2", nativeQuery = true)
	    List<HistoriaClinica> getPaginatedHistoriaClinica(int limit, int offset);


	
}