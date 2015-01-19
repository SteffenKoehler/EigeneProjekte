package controll;

import java.util.Scanner;

import spieler.SpielerO;
import spieler.SpielerX;
import spielfeld.Spielfeld;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spielfeld spielfeld = new Spielfeld();
		
		sc = new Scanner(System.in);
	    System.out.print("Gib deinen Namen ein: ");
	    String nameSp1 = sc.next();
		SpielerO spieler1 = new SpielerO(nameSp1);
		System.out.println(spieler1);
		System.out.print("Gib deinen Namen ein: ");
		SpielerX spieler2 = new SpielerX(sc.next());
		System.out.println(spieler2);
		
		
		System.out.println("++++++++++++++++++++++");
		System.out.println(spieler2.getName());
		
	    
		spielfeld.printSpielfeld();
		spieler1.setzeStein(sc.nextInt());
		spielfeld.printSpielfeld();
		spieler2.setzeStein(sc.nextInt());
		
		spielfeld.printSpielfeld();
		

	}

}
