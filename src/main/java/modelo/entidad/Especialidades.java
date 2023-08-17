package modelo.entidad;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "especialidad")
    private Set<Doctores> doctores = new HashSet<>();
    
    // Constructor Vacio
    public Especialidades() {
         
    }

    public Especialidades(String nombre, Set<Doctores> doctores) {
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

    public Set<Doctores> getDoctores() {
        return doctores;
    }

    public void setDoctores(Set<Doctores> doctores) {
        this.doctores = doctores;
    }
}
