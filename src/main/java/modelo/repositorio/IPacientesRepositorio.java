package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Pacientes;

@Repository
public interface IPacientesRepositorio extends JpaRepository<Pacientes, Integer> {
    // Puedes definir métodos personalizados de consulta aquí si es necesario
}