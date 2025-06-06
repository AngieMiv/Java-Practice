package ra7;

import model.Tuberia;
import model.TuboAcero;
import model.TuboCeramico;
import model.TuboPlastico;

public class RA7 {

	public RA7() {}

	public void informeStock(Tuberia[] CajasPiezas) {

		System.out.println();
		System.out.println("INFORME STOCK");
		System.out.println("--------------------------------------------");
		System.out.println("Tipo de Tubería \tNúmero de unidades");
		System.out.println("--------------------------------------------");

		int numeroTuboPlastico = 0, numeroTuboAcero = 0, numeroTuboCeramico = 0;

		for (int i = 0; i < CajasPiezas.length; i++) {
			
			Tuberia pieza = CajasPiezas[i];
			
			if (pieza instanceof TuboPlastico) {
				numeroTuboPlastico += pieza.getUnidades();
			} else if (pieza instanceof TuboAcero) {
				numeroTuboAcero += pieza.getUnidades();
			} else if  (pieza instanceof TuboCeramico) {
				numeroTuboCeramico += pieza.getUnidades();
			} else {
				System.out.println("Tubería desconocida en posicion: " + i);
			} // end if
			
		} // end for

		System.out.println("Tubo de Plástico \t"+ numeroTuboPlastico);
		System.out.println("Tubo de Acero \t\t"+ numeroTuboAcero);
		System.out.println("Tubo de Cerámica \t"+ numeroTuboCeramico);
		System.out.println("--------------------------------------------");
		System.out.println();

	}

	public void informeImpuesto(Tuberia[] CajasPiezas) {
		System.out.println();
		System.out.println("INFORME IMPUESTO");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Tipo de Tubería \tValor\t\tImpuesto\tValor Total");
		System.out.println("--------------------------------------------------------------------");

		double precioTP = 0, precioTA = 0, precioTC = 0;
		double impTP = 0, impTA = 0, impTC = 0;

		for (int i = 0; i < CajasPiezas.length; i++) {
			
			Tuberia pieza = CajasPiezas[i];
			
			if (pieza instanceof TuboPlastico) {
				precioTP += pieza.ValorStock();
				impTP += pieza.calculaImpuesto();
			} else if (pieza instanceof TuboAcero) {
				precioTA += pieza.ValorStock();
				impTA += pieza.calculaImpuesto();
			} else if (pieza instanceof TuboCeramico) {
				precioTC += pieza.ValorStock();
				impTC += pieza.calculaImpuesto();
			} // end if
			
		} // end for

		System.out.println("Tubo de Plástico\t" + precioTP + "\t \t" + impTP + "\t \t" + (precioTP + impTP));
		System.out.println("Tubo de Acero\t\t"+  precioTA + "\t \t" + impTA + "\t \t" + (precioTA + impTA));
		System.out.println("Tubo de Cerámica\t"+ precioTC + "\t \t" + impTC + "\t \t" + (precioTC + impTC));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total:\t\t\t\t\t\t\t" + (precioTP + impTP + precioTA + impTA + precioTC + impTC));
		System.out.println();
	}
}
