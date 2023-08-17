package modelo.servicio;

import java.util.List;

import modelo.entidad.Detalle;
import modelo.entidad.Doctores;
import modelo.repositorio.IDescuentoStrategy;

public class DescuentoEdadStrategy implements IDescuentoStrategy {
	@Override
    public double calcularDescuento(List<Detalle> detalles) {
        double descuentoPorEdad = calcularDescuentoPorEdad(detalles.get(0).getPaciente().getEdad());
        double descuentoPorEspecialidadYExperiencia = calcularDescuentoPorEspecialidadYExperiencia(detalles.get(0).getDoctor());

        return Math.max(descuentoPorEdad, descuentoPorEspecialidadYExperiencia);
    }

    private double calcularDescuentoPorEdad(int edad) {
        if (edad <= 5) {
            return 0.05; // 5% de descuento
        } else if (edad > 5 && edad < 13) {
            return 0.03; // 3% de descuento
        } else if (edad >= 13 && edad <= 35) {
            return 0.0; // Sin descuento
        } else if (edad > 35 && edad < 60) {
            return 0.10; // 10% de descuento
        } else {
            return 0.30; // 30% de descuento
        }
    }

    private double calcularDescuentoPorEspecialidadYExperiencia(Doctores doctor) {
        String especialidad = doctor.getEspecialidad().getNombre();
        int experiencia = doctor.getExperiencia();

        if (experiencia < 10) {
            return 0.15; // 15% de descuento
        } else if ((especialidad.equals("Cardiología") || especialidad.equals("Neurología")) && experiencia > 10 && experiencia < 20) {
            return 0.05; // 5% de descuento
        } else if ((especialidad.equals("Endocrinología") || especialidad.equals("Oncología")) && experiencia > 5) {
            return 0.10; // 10% de descuento
        } else if (especialidad.equals("Dermatología")) {
            return 0.0; // Sin descuento
        } else if (experiencia > 20) {
            return 0.05; // 5% de descuento
        } else {
            return 0.0; // Sin descuento por defecto
        }
    }
}