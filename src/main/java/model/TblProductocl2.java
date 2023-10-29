package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl2")
@NamedQuery(name="TblProductocl2.findAll", query="SELECT t FROM TblProductocl2 t")
public class TblProductocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;

	private String descripcion;

	private String estadocl2;

	private String nombrecl2;

	private double preciocompracl2;

	private double precioventacl2;

	public TblProductocl2() {
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstadocl2() {
		return this.estadocl2;
	}

	public void setEstadocl2(String estadocl2) {
		this.estadocl2 = estadocl2;
	}

	public String getNombrecl2() {
		return this.nombrecl2;
	}

	public void setNombrecl2(String nombrecl2) {
		this.nombrecl2 = nombrecl2;
	}

	public double getPreciocompracl2() {
		return this.preciocompracl2;
	}

	public void setPreciocompracl2(double preciocompracl2) {
		this.preciocompracl2 = preciocompracl2;
	}

	public double getPrecioventacl2() {
		return this.precioventacl2;
	}

	public void setPrecioventacl2(double precioventacl2) {
		this.precioventacl2 = precioventacl2;
	}

}