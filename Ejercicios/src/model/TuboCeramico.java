package model;

public class TuboCeramico extends Tuberia {

	private int temperatura;

	public TuboCeramico(String nombre, int unidades, double precio_ud,int temp) {
		super(nombre, unidades, precio_ud);
		this.temperatura = temp;

	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public double ValorStock() {
		return this.getPrecio_ud() * this.getUnidades();
	}

	/**
	 * Los tubos cerámicos no tienen impuesto
	 */
	@Override
	public double calculaImpuesto() {
		return 0.0;
	}
}
