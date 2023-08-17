package modelo.entidad;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class Citas {
	@Id
    @Column(name = "Paciente_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private Date Fecha;
	
	
	
	//Contructor Vacio
    public Citas() {
       
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Doctor_ID")
    private Doctores Doctor_ID;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Facturas_ID")
    private Facturas Facturas_ID;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Pacientes_ID")
    private Pacientes Pacientes_ID;



	public Citas(Date fecha, Doctores doctor_ID, Facturas facturas_ID, Pacientes pacientes_ID) {
		super();
		Fecha = fecha;
		Doctor_ID = doctor_ID;
		Facturas_ID = facturas_ID;
		Pacientes_ID = pacientes_ID;
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



	public Doctores getDoctor_ID() {
		return Doctor_ID;
	}



	public void setDoctor_ID(Doctores doctor_ID) {
		Doctor_ID = doctor_ID;
	}



	public Facturas getFacturas_ID() {
		return Facturas_ID;
	}



	public void setFacturas_ID(Facturas facturas_ID) {
		Facturas_ID = facturas_ID;
	}



	public Pacientes getPacientes_ID() {
		return Pacientes_ID;
	}



	public void setPacientes_ID(Pacientes pacientes_ID) {
		Pacientes_ID = pacientes_ID;
	}
 
	
}
