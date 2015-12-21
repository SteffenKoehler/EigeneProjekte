package modi;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
import spieler.Spieler;
import spielfeld.Spielfeld;

public class PvP {
	private Spieler spieler1;
	private Spieler spieler2;
	Scanner scanner = new Scanner(System.in);
	
	
	public void spielStart(Spielfeld spielfeld){
		
		System.out.println("Spieler 1, bitte Namen eingeben: ");
		spieler1 = new Spieler(scanner.nextLine(), '0');
		System.out.println("Hallo " + spieler1.getName() + " viel Spaﬂ beim Spiel.");
		System.out.println(spieler1.getName() + " dein Spielstein: " + spieler1.getSpielstein());
		System.out.println("_________________________");
		
		
		System.out.println("Spieler 2, bitte Namen eingeben: ");
		spieler2 = new Spieler(scanner.nextLine(), 'X');
		System.out.println("Hallo " + spieler2.getName() + " viel Spaﬂ beim Spiel.");
		System.out.println(spieler2.getName() + " dein Spielstein: " + spieler2.getSpielstein());
		System.out.println("_________________________");
		
		spielfeld.zeichneSpielfeld();
		spiel(spielfeld);
		
	}
	
	
	private void spiel(Spielfeld spielfeld){
		while(Spielfeld.isRunning){
			System.out.println(spieler1.getName() + " dein Zug " + "(" + spieler1.getSpielstein() + ")");
			spielfeld.setzeStein(scanner.nextInt(), spieler1.getSpielstein());
			
			if(Spielfeld.isRunning){
				System.out.println(spieler2.getName() + " dein Zug " + "(" + spieler2.getSpielstein() + ")");
				spielfeld.setzeStein(scanner.nextInt(), spieler2.getSpielstein());
			}
		}
		
		gewinner(spielfeld);
	}
	
	
	private void gewinner(Spielfeld spielfeld){	
		try {
			loescheConsole();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		spielfeld.zeichneSpielfeld();
		
		if(spieler1.getSpielstein() == spielfeld.getGewinnStein()){
			System.out.println("Gewinner ist: " + spieler1.getName());
		}else{
			System.out.println("Gewinner ist: " + spieler2.getName());
		}
	}
	
	private void loescheConsole() throws IOException {

		final String operatingSystem = System.getProperty("os.name");

		if (operatingSystem.contains("Windows")) {
			Runtime.getRuntime().exec("cls");
		} else {
			Runtime.getRuntime().exec("clear");
		}
	}
}
