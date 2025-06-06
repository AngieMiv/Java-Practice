
import model.TuboAcero;
import model.Tuberia;
import model.TuboPlastico;
import model.TuboCeramico;
import ra7.RA7;


public class AppMain {

	public static void main(String[] args) {
		
		System.out.println("Inicio Aplicacion");
		
		RA7 ra7 = new RA7();
		
		Tuberia[] Partida = new Tuberia[8];
		Partida[7]= new TuboAcero("IRONHORSE", 50, 1.2, 0.35);
		Partida[6]= new TuboAcero("IRONHORSE", 50, 1.2 ,0.35);
		Partida[5]= new TuboPlastico("SELENIUM", 50, 1.2, "25KP");
		Partida[4]= new TuboAcero("IRONHORSE", 50, 1.2, 0.35);
		Partida[3]= new TuboPlastico("SELENIUM", 50, 1.2, "50KP");
		Partida[2]= new TuboPlastico("SELENIUM", 50, 1.2, "100KP");
		Partida[1]= new TuboCeramico("ISOFIX", 50, 1.2, 255);
		Partida[0]= new TuboPlastico("SELENIUM", 50, 1.2, "25KP");
		
		ra7.informeStock(Partida);
		ra7.informeImpuesto(Partida);
		
		System.out.println("Fin Aplicacion");

	} // main

}
