package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Especialidades;

@Repository
public interface IEspecialidadesRepositorio extends JpaRepository<Especialidades, Integer> {
    // Puedes definir métodos personalizados de consulta aquí si es necesario
}