package modelo.entidad;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @ManyToOne
    @JoinColumn(name = "Paciente_ID")
    private Pacientes paciente;

    @ManyToOne
    @JoinColumn(name = "Doctor_ID")
    private Doctores doctor;
    
    

    @Column(name = "Fecha_Cita")
    private Date fechaCita;

    @Column(name = "Sintomas")
    private String sintomas;

    @Column(name = "Diagnostico")
    private String diagnostico;

    @Column(name = "Tratamiento")
    private String tratamiento;
    
    //Contructor Vacio
    public HistoriaClinica() {
       
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

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
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