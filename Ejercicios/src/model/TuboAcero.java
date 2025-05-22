package model;

public class TuboAcero extends Tuberia {

	private double Seccion;

	public TuboAcero(String nombre, int unidades, double precio_ud,double seccion) {
		super(nombre, unidades, precio_ud); // Usar superclase para inicializar
		Seccion = seccion;
	}

	public double ValorStock() {
		return this.getPrecio_ud() * this.getUnidades();
	}

	/**
	 * Impuesto tubos de acero = 2% mas una cantidad fija de 0.02 por unidad
	 */
	@Override
	public double calculaImpuesto() {
		return this.getPrecio_ud() * 0.02 + (0.02 * this.getUnidades());
	}

}
