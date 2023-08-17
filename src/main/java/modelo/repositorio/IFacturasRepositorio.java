package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Facturas;

@Repository
public interface IFacturasRepositorio extends JpaRepository<Facturas, Integer> {
    // Puedes definir métodos personalizados de consulta aquí si es necesario
}