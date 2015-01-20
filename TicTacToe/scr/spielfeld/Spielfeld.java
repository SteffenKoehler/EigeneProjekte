package spielfeld;

public class Spielfeld {

	public static char[] spielfeld;

	public Spielfeld() {
		Spielfeld.spielfeld = new char[10];
		clearSpielfeld();
	}
	
	public char[] getSpielfeld(){
		return Spielfeld.spielfeld;
	}
	
	public char getSpielstein(int feld){
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

	public void setzen(char stein, int feld) {
		Spielfeld.spielfeld[feld] = stein;
	}
	
	public void clearSpielfeld(){
		for (int i = 1; i < spielfeld.length; i++) {

			spielfeld[i] = '_';

		}
	}

}
