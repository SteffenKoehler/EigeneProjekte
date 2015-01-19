package spielfeld;

public class Spielfeld {

	public static char[] spielfeld;

	public Spielfeld() {
		Spielfeld.spielfeld = new char[9];

		for (int i = 0; i < spielfeld.length; i++) {

			spielfeld[i] = '_';

		}
	}
	
	public char[] getSpielfeld(){
		return Spielfeld.spielfeld;
	}
	
	public char getSpielstein(int feld){
		return Spielfeld.spielfeld[feld];
	}

	public void printSpielfeld() {
		for (int i = 0; i < spielfeld.length; i++) {
			if (i == 3 | i == 6) {
				System.out.println(" |" + "\n");
			}
			System.out.print(" | " + spielfeld[i]);
			}
		System.out.println(" |" + "\n" + "***********************************");
	}

	public void setzen(char stein, int feld) {
		Spielfeld.spielfeld[feld] = stein;
	}

}
