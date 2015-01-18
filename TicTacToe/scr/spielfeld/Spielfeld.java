package spielfeld;

import java.util.Arrays;

import javax.swing.plaf.SliderUI;

public class Spielfeld {

	public char[] spielfeld;

	public Spielfeld() {
		this.spielfeld = new char[9];

		for (int i = 0; i < spielfeld.length; i++) {

			spielfeld[i] = '_';

		}
	}
	
	public char[] getSpielfeld(){
		return this.spielfeld;
	}

	public void printSpielfeld() {
		for (int i = 0; i < spielfeld.length; i++) {
			if (i == 3 | i == 6) {
				System.out.println(" |" + "\n");
			}
			System.out.print(" | " + spielfeld[i]);
			}
		System.out.println(" |" + "\n");
	}

	public void setzen(char stein, int feld) {
		spielfeld[feld] = stein;
	}

}
