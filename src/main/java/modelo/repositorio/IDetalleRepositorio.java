package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import modelo.entidad.Detalle;

@Repository
public interface IDetalleRepositorio extends JpaRepository<Detalle, Integer> {
    // Puedes definir métodos personalizados de consulta aquí si es necesario
}