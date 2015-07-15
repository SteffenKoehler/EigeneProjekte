package spielfeld;

import Spielstein.DefaultSpielstein;
import Spielstein.Spielstein;

public class Spielfeld {

	public static Spielstein[] spielfeld;

	public Spielfeld() {
		Spielfeld.spielfeld = new Spielstein[10];
		clearSpielfeld();
	}
	
	public Spielstein[] getSpielfeld(){
		return Spielfeld.spielfeld;
	}
	
	public Spielstein getSpielstein(int feld){
		return Spielfeld.spielfeld[feld];
	}

	public void printSpielfeld() {
		for (int i = 1; i < spielfeld.length; i++) {
			if (i == 4 | i == 7) {
				System.out.println(" |" + "\n");
			}
			System.out.print(" | " + spielfeld[i]);
			}
		System.out.println(" |" + "\n" + "***********************************");
	}

	public void setzen(Spielstein stein, int feld) {
		Spielfeld.spielfeld[feld] = stein;
	}
	
	public void clearSpielfeld(){
		for (int i = 1; i < spielfeld.length; i++) {

			spielfeld[i] = new DefaultSpielstein();

		}
	}

}
