package modelo.main;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import modelo.entidad.Detalle;
import modelo.servicio.DescuentoEdadStrategy;
import modelo.servicio.DescuentoExperienciaEspecialidadStrategy;
import modelo.servicio.DetalleServicio;

public class Main {
    public static void main(String[] args) {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/WEB-INF/spring/servlet-context.xml");

        DetalleServicio detalleServicio = applicationContext.getBean(DetalleServicio.class);
        List<Detalle> detalles = detalleServicio.getDetalle();

        DescuentoEdadStrategy descuentoEdadStrategy = new DescuentoEdadStrategy();
        double descuentoEdad = descuentoEdadStrategy.calcularDescuento(detalles);
        System.out.println("Descuento por edad: " + descuentoEdad);

        DescuentoExperienciaEspecialidadStrategy descuentoExperienciaEspecialidadStrategy = new DescuentoExperienciaEspecialidadStrategy();
        double descuentoExperienciaEspecialidad = descuentoExperienciaEspecialidadStrategy.calcularDescuento(detalles);
        System.out.println("Descuento por experiencia y especialidad: " + descuentoExperienciaEspecialidad);

        // Cierra el contexto de la aplicación
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
