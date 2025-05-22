package model;

public class TuboPlastico extends Tuberia {

	private String Dureza;		// 25KP,50KP,100KP

	public TuboPlastico(String nombre, int unidades, double precio_ud,String TCab) {
		super(nombre, unidades, precio_ud);
		Dureza = TCab;
	}

	public double ValorStock() {
		return this.getPrecio_ud() * this.getUnidades();
	}

	/**
	 * Impuesto de tubos plásticos = 8%
	 */
	@Override
	public double calculaImpuesto() {
		return this.getPrecio_ud() * 0.08 * this.getUnidades();
	}
}
