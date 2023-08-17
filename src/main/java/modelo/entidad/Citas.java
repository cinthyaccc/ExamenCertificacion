package modelo.entidad;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "citas")
public class Citas {
    @Id
    @Column(name = "ID") // Cambia el nombre de la columna
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private Date Fecha;

    // Resto del código
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Doctor_ID")
    
    private Doctores doctor;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Factura_ID")
    @JsonBackReference
    private Facturas facturas;
    
  

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Paciente_ID") // Mantén el nombre para la relación con Pacientes
    @JsonBackReference
    private Pacientes pacientes;
    
    // Constructor Vacio
    public Citas() {

    }
    
    public Citas(Date fecha, Doctores doctor, Facturas facturas, Pacientes pacientes) {
        super();
        Fecha = fecha;
        this.doctor = doctor;
        this.facturas = facturas;  // Corregido aquí
        this.pacientes = pacientes; // Corregido aquí
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
    }

    public Facturas getFacturas() {
        return facturas;
    }

    public void setFacturas(Facturas facturas) {
        this.facturas = facturas;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }
}
