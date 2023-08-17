package modelo.entidad;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
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
@Table(name = "pacientes")
public class Pacientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Fecha_Nacimiento")
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<HistoriaClinica> historiasClinicas;

    @OneToMany(mappedBy = "pacientes", cascade = CascadeType.ALL)
    private List<Citas> citas;
    
    //Contructor Vacio
    public Pacientes() {
       
    }

	public Pacientes(String nombre, Date fechaNacimiento, List<HistoriaClinica> historiasClinicas, List<Citas> citas) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.historiasClinicas = historiasClinicas;
		this.citas = citas;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	  // Método para obtener la edad a partir de la fecha de nacimiento
    public int getEdad() {
        LocalDate fechaNacimiento = this.fechaNacimiento.toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<HistoriaClinica> getHistoriasClinicas() {
		return historiasClinicas;
	}

	public void setHistoriasClinicas(List<HistoriaClinica> historiasClinicas) {
		this.historiasClinicas = historiasClinicas;
	}

	public List<Citas> getCitas() {
		return citas;
	}

	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}
    
    
    
}
