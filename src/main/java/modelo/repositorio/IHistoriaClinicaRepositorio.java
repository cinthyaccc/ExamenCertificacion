package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.HistoriaClinica;

@Repository
public interface IHistoriaClinicaRepositorio extends JpaRepository<HistoriaClinica, Integer> {
    // Puedes definir métodos personalizados de consulta aquí si es necesario
}