package modelo.servicio;

import java.util.List;

import modelo.entidad.Detalle;
import modelo.entidad.Doctores;
import modelo.entidad.Especialidades;
import modelo.repositorio.IDescuentoStrategy;

public class DescuentoExperienciaEspecialidadStrategy implements IDescuentoStrategy {
	 @Override
	    public double calcularDescuento(List<Detalle> detalles) {
	        // Implementa el cálculo de descuento basado en experiencia y especialidad
	        double descuento = 0.0;

	        for (Detalle detalle : detalles) {
	            Doctores doctor = detalle.getDoctor();
	            if (doctor != null) {
	                Especialidades especialidad = doctor.getEspecialidad();
	                int experiencia = doctor.getExperiencia();

	                if (especialidad != null) {
	                    if (experiencia < 10) {
	                        descuento += 0.15; // 15% de descuento
	                    } else if ((especialidad.getNombre().equals("Cardiología") || especialidad.getNombre().equals("Neurología")) &&
	                               experiencia >= 10 && experiencia < 20) {
	                        descuento += 0.05; // 5% de descuento
	                    } else if ((especialidad.getNombre().equals("Endocrinología") || especialidad.getNombre().equals("Oncología")) &&
	                               experiencia > 5) {
	                        descuento += 0.10; // 10% de descuento
	                    } else if (!especialidad.getNombre().equals("Dermatología")) {
	                        descuento += 0.05; // 5% de descuento para más de 20 años de experiencia
	                    }
	                }
	            }
	        }

	        return descuento;
	    }
	}