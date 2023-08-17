package modelo.entidad;

import java.math.BigDecimal;
import java.sql.Date;
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
@Table(name = "facturas")
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "Fecha_Pago")
    private Date fechaPago;
    
    @OneToMany(mappedBy = "facturas", cascade = CascadeType.ALL)
    private List<Citas> citas;
    
   //Contructor Vacio
    public Facturas() {
       
    }

public Facturas(BigDecimal monto, Date fechaPago, List<Citas> citas) {
	super();
	this.monto = monto;
	this.fechaPago = fechaPago;
	this.citas = citas;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public BigDecimal getMonto() {
	return monto;
}

public void setMonto(BigDecimal monto) {
	this.monto = monto;
}

public Date getFechaPago() {
	return fechaPago;
}

public void setFechaPago(Date fechaPago) {
	this.fechaPago = fechaPago;
}

public List<Citas> getCitas() {
	return citas;
}

public void setCitas(List<Citas> citas) {
	this.citas = citas;
}
    
    
    
}
