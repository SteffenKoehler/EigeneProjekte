package controll;

import spieler.SpielerO;
import spielfeld.Spielfeld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpielerO spieler1 = new SpielerO("hallo");
		
		
		System.out.println(spieler1);
		

		Spielfeld spielfeld = new Spielfeld();
		spielfeld.printSpielfeld();
		
		System.out.println("******************************************");
		
//		spielfeld.setzen('X', 3);
//		spielfeld.setzen('O', 0);
//		spielfeld.setzen('X', 4);
//		spielfeld.setzen('O', 5);
//		spielfeld.setzen('X', 1);
//		spielfeld.setzen('O', 7);
		
		spielfeld.printSpielfeld();
		
		spieler1.setzeStein(5);
	}

}
