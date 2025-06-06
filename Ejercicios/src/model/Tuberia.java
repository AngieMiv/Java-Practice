package model;

public abstract class Tuberia {

	private String Marca;
	public int Unidades;
	private double precio_ud;
	
	public Tuberia(String marca, int unidades, double precio_ud) {
		super();
		Marca = marca;
		Unidades = unidades;
		this.precio_ud = precio_ud;
	}
	
	public abstract double ValorStock();
	public abstract double calculaImpuesto();
	
	// getters y setters
	public int getUnidades() {	return Unidades;	}
	public void setUnidades(int unidades) {	Unidades = unidades;	}
	
	public double getPrecio_ud() {	return precio_ud;	}
	public void setPrecio_ud(double precio_ud) {	this.precio_ud = precio_ud;	}
	
	public String getMarca() {	return Marca;	}
	public void setMarca(String nombre) {	Marca = nombre;	}
	
}
