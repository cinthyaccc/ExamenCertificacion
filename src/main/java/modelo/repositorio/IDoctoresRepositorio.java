package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Doctores;

@Repository
public interface IDoctoresRepositorio extends JpaRepository<Doctores, Integer> {
    // Puedes definir métodos personalizados de consulta aquí si es necesario
}