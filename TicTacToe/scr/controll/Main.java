package controll;

import spieler.SpielerO;
import spieler.SpielerX;
import spielfeld.Spielfeld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpielerO spieler1 = new SpielerO("SpielerO");
		SpielerX spieler2 = new SpielerX("SpielerX");
		
		
		System.out.println(spieler1);
		System.out.println(spieler2);
		

		Spielfeld spielfeld = new Spielfeld();
		spielfeld.printSpielfeld();
		
		spielfeld.printSpielfeld();
		spieler1.setzeStein(5);
		spielfeld.printSpielfeld();
		spieler2.setzeStein(0);
		spielfeld.printSpielfeld();
		spieler1.setzeStein(4);
		spieler2.setzeStein(8);
		spieler1.setzeStein(3);
		spieler2.setzeStein(6);
		spielfeld.printSpielfeld();
	}

}
