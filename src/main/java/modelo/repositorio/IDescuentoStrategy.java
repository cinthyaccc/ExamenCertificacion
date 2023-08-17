package modelo.repositorio;

import java.util.List;

import org.springframework.stereotype.Repository;

import modelo.entidad.Detalle;

@Repository
public interface IDescuentoStrategy {
	double calcularDescuento(List<Detalle> detalles);
	}
