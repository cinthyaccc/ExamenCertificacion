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

@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Doctor_ID")
    private Doctores doctor;
    
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Paciente_ID")
    private Pacientes paciente;


    @Column(name = "Fecha_Cita")
    private Date fecha;

    @Column(name = "Sintomas")
    private String sintomas;

    @Column(name = "Diagnostico")
    private String diagnostico;

    @Column(name = "Tratamiento")
    private String tratamiento;
    
    // Constructor Vacío
    public HistoriaClinica() {
       
    }

    public HistoriaClinica(Pacientes paciente, Doctores doctor, Date fecha, String sintomas, String diagnostico,
			String tratamiento) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
		this.fecha = fecha;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
    

}
