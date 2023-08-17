package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Citas;

@Repository
public interface ICitasRepositorio extends JpaRepository<Citas, Integer> {
    // Puedes definir métodos personalizados de consulta aquí si es necesario
}