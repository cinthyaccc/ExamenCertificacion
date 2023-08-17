package modelo.entidad;

public class Detalle {
    private Pacientes paciente;
    private Doctores doctor;

  //Contructor Vacio
    public Detalle() {
       
    }

public Detalle(Pacientes paciente, Doctores doctor) {
	super();
	this.paciente = paciente;
	this.doctor = doctor;
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
    
    
    
    
    // Constructor, getters y setters
}
