package controll;

import java.util.Scanner;

import spieler.Spieler;
import spielfeld.Spielfeld;

public class Controll {

	Scanner sc = new Scanner(System.in);
	Spieler spieler;

	public void korrekterZug(Spieler spieler, int feld) {

		if (istZugmoeglich(feld)) {
			Spielfeld.spielfeld[feld] = spieler.getSymbol();
		} else {
			this.korrekterZug(spieler, sc.nextInt());
		}

	}

	private boolean istZugmoeglich(int feld) {
		if (feld < 1 || feld > 9) {
			System.out.println("Bitte eine Zahl zwischen 1 und 9 eingeben");
			return false;
		} else if (Spielfeld.spielfeld[feld] != '_') {
			System.out.println("Bitte ein freies Feld wählen");
			return false;
		} else {
			return true;
		}
	}
	
	public boolean istSpielGewonnen(){
		if(siegDiagonal(spieler)){
			System.out.println("Sieger ist: " + spieler.getSpieler().getName());
		}
		return false;
	}
	
	private boolean siegDiagonal(Spieler spieler){
		if(Spielfeld.spielfeld[1] == spieler.getSymbol()){
			if(Spielfeld.spielfeld[3] == spieler.getSymbol()){
				if(Spielfeld.spielfeld[9] == spieler.getSymbol()){
					return true;
				}
			}
		}
		return false;
	}
}
