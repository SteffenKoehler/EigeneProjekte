package controll;

import java.util.Scanner;

import spieler.Spieler;
import spieler.SpielerO;
import spieler.SpielerX;
import spielfeld.Spielfeld;

public class Main {

	private static Scanner sc;
	public static Controll controll = new Controll();
	public static Spielfeld spielfeld = new Spielfeld();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
	    System.out.print("Gib deinen Namen ein: ");
	    String nameSp1 = sc.next();
		SpielerO spieler1 = new SpielerO(nameSp1);
		System.out.println(spieler1);
		System.out.print("Gib deinen Namen ein: ");
		SpielerX spieler2 = new SpielerX(sc.next());
		System.out.println(spieler2);
		
		
		System.out.println("++++++++++++++++++++++");
		
		
		while(!controll.istSpielGewonnen()){
	    
		spielfeld.printSpielfeld();
		spieler2.setzeStein(sc.nextInt());
		spielfeld.printSpielfeld();
		spieler1.setzeStein(sc.nextInt());
		
		}

	}

}
