package modelo.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "doctores")
public class Doctores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "Nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "Especialidad_ID")
    private Especialidades especialidad;

    @Column(name = "Experiencia")
    private int experiencia;
    
    
    @OneToMany(mappedBy = "historia_Clinica", cascade = CascadeType.ALL)
    private List<HistoriaClinica> hitoriaClinica;
    
    @OneToMany(mappedBy = "citas", cascade = CascadeType.ALL)
    private List<Citas> citas;
    
  //Contructor Vacio
    public Doctores() {
       
    }


public Doctores(String nombre, Especialidades especialidad, int experiencia, List<HistoriaClinica> historiaClinica, List<Citas> citas) {
	super();
	this.nombre = nombre;
	this.especialidad = especialidad;
	this.experiencia = experiencia;
	this.hitoriaClinica= historiaClinica;
	this.citas= citas;
}


public List<Citas> getCitas() {
	return citas;
}


public void setCitas(List<Citas> citas) {
	this.citas = citas;
}


public List<HistoriaClinica> getHitoriaClinica() {
	return hitoriaClinica;
}


public void setHitoriaClinica(List<HistoriaClinica> hitoriaClinica) {
	this.hitoriaClinica = hitoriaClinica;
}


public int getID() {
	return ID;
}


public void setID(int iD) {
	ID = iD;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public Especialidades getEspecialidad() {
	return especialidad;
}


public void setEspecialidad(Especialidades especialidad) {
	this.especialidad = especialidad;
}


public int getExperiencia() {
	return experiencia;
}


public void setExperiencia(int experiencia) {
	this.experiencia = experiencia;
}
    
    
    
    
}
