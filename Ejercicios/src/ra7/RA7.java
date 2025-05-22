package ra7;

import model.Tuberia;

public class RA7 {
	
	public RA7() {}
	
	public void informeStock(Tuberia[] CajasPiezas) {
		
		System.out.println();
		System.out.println("INFORME STOCK");
		System.out.println("--------------------------------------------");
		System.out.println("Tipo de Tubería \tNúmero de unidades");
		System.out.println("--------------------------------------------");
		
		int numTP = 0, numTA = 0, numTC = 0;
		int TP = 0, TA = 0, TC = 0;
		
		for (int i = 0; i < CajasPiezas.length; i++) {
			String className = CajasPiezas[i].getClass().getSimpleName();
			if ("TuboPlastico".equals(className)) {
				TP += 1;
				numTP += CajasPiezas[i].getUnidades();
			} else if ("TuboAcero".equals(className)) {
				TA += 1;
				numTA += CajasPiezas[i].getUnidades();
			} else if ("TuboCeramico".equals(className)) {
				TC += 1;
				numTC += CajasPiezas[i].getUnidades();
			} // end if
		} // end for
		
		System.out.println("Tubo de Plástico \t"+ numTP);
		System.out.println("Tubo de Acero \t\t"+ numTA);
		System.out.println("Tubo de Cerámica \t"+ numTC);
		System.out.println("--------------------------------------------");
		System.out.println();

	}
	
	public void informeImpuesto(Tuberia[] CajasPiezas) {
		System.out.println();
		System.out.println("INFORME IMPUESTO");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Tipo de Tubería \tValor\t\tImpuesto\tValor Total");
		System.out.println("--------------------------------------------------------------------");
		
		int numTP = 0, numTA = 0, numTC = 0;
		int TP = 0, TA = 0, TC = 0;
		double precioTP = 0, precioTA = 0, precioTC = 0;
		double impTP = 0, impTA = 0, impTC = 0;
		
		for (int i = 0; i < CajasPiezas.length; i++) {
			String className = CajasPiezas[i].getClass().getSimpleName();
			if ("TuboPlastico".equals(className)) {
				TP += 1;
				numTP += CajasPiezas[i].getUnidades();
				precioTP += CajasPiezas[i].ValorStock();
				impTP += CajasPiezas[i].calculaImpuesto();
			} else if ("TuboAcero".equals(className)) {
				TA += 1;
				numTA += CajasPiezas[i].getUnidades();
				precioTA += CajasPiezas[i].ValorStock();
				impTA += CajasPiezas[i].calculaImpuesto();
			} else if ("TuboCeramico".equals(className)) {
				TC += 1;
				numTC += CajasPiezas[i].getUnidades();
				precioTC += CajasPiezas[i].ValorStock();
			} // end if
		} // end for
		
		System.out.println("Tubo de Plástico\t" + precioTP + "\t \t" + impTP + "\t \t" + (precioTP + impTP));
		System.out.println("Tubo de Acero\t\t"+  precioTA + "\t \t" + impTA+ "\t \t" + (precioTA + impTA));
		System.out.println("Tubo de Cerámica\t"+ precioTC + "\t \t" + impTC+ "\t \t" + (precioTC + impTC));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total:\t\t\t\t\t\t\t" + (precioTP + impTP + precioTA + impTA + precioTC + impTC));
		System.out.println();
	}
}
