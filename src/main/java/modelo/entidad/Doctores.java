package modelo.entidad;

import java.util.List;
import java.util.Set;

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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity

@Table(name = "doctores")
public class Doctores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;

    @Column(name = "Nombre")
    private String nombre;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Especialidad_ID")
    private Especialidades especialidad;

    @Column(name = "Experiencia")
    private int experiencia;

    @JsonBackReference
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HistoriaClinica> historiaClinica;



    // Constructor Vacio
    public Doctores() {

    }

   

    public Doctores(String nombre, Especialidades especialidad, int experiencia,
			List<HistoriaClinica> historiaClinica) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.experiencia = experiencia;
		this.historiaClinica = historiaClinica;
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



	public List<HistoriaClinica> getHistoriaClinica() {
		return historiaClinica;
	}



	public void setHistoriaClinica(List<HistoriaClinica> historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
    

}
