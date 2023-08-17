package modelo.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "especialidades")
public class Especialidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "Nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "especialidad", cascade = CascadeType.ALL)
    private List<Doctores> doctores;
    //Contructor Vacio
      public Especialidades() {
         
      }
	public Especialidades(String nombre, List<Doctores> doctores) {
		super();
		this.nombre = nombre;
		this.doctores = doctores;
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
	public List<Doctores> getDoctores() {
		return doctores;
	}
	public void setDoctores(List<Doctores> doctores) {
		this.doctores = doctores;
	}
      
      
      
}
