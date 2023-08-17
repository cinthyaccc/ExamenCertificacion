package modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Detalle;
import modelo.repositorio.IDetalleRepositorio;

@Service
public class DetalleServicio {

    private final IDetalleRepositorio detRepository;

    @Autowired
    public DetalleServicio(IDetalleRepositorio detRepository) {
        this.detRepository = detRepository;
    }

    public List<Detalle> getDetalle() {
        return detRepository.findAll();
    }
}
