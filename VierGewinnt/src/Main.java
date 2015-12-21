import java.util.Scanner;

import javax.sound.midi.Soundbank;

import modi.PvP;
import spieler.Spieler;
import spielfeld.Spielfeld;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spielfeld spielfeld = new Spielfeld();
		
		
		System.out.println("Wähle den Spielmodus");
		System.out.println("[1] Für PvP");
		
		switch (scanner.nextInt()) {
		case 1:
			PvP pvp = new PvP();
			pvp.spielStart(spielfeld);
			break;

		default:
			break;
		}	
		
		scanner.close();
		
		
	}

}
