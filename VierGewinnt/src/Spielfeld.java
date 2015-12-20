
public class Spielfeld {

	public static boolean isRunning = true;
	private char[][] spielfeld;
	private char gewinnStein = ' ';

	public char getGewinnStein() {
		return gewinnStein;
	}

	public void setGewinnStein(char gewinnStein) {
		this.gewinnStein = gewinnStein;
	}



	public Spielfeld() {
		this.spielfeld = new char[7][7];
		fuelleSpielfeld();
	}
	
	
	private void fuelleSpielfeld() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				this.spielfeld[i][j] = Character.forDigit(j, 10);
			}
		}

		for (int i = 1; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld[i].length; j++) {
				this.spielfeld[i][j] = ' ';
			}
		}
	}

	public void zeichneSpielfeld() {

		// Zahlen
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				System.out.print(" " + this.spielfeld[i][j] + " ");
			}
			System.out.println("");
		}

		// Steine
		for (int i = 1; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld[i].length; j++) {
				System.out.print("[" + this.spielfeld[i][j] + "]");
			}
			System.out.println("");
		}
		System.out.println("_________________________");
	}

	public void setzeStein(int position, char stein) {
		if (0 <= position && position < 7) {
			for (int i = this.spielfeld.length - 1; i > 0; i--) {
				if (this.spielfeld[i][position] == ' ') {
					this.spielfeld[i][position] = stein;
					stein = ' ';
				}
			}
			zeichneSpielfeld();
			pruefeSieg();
		} else {
			System.out.println("Fehlerhafte Eingabe - Nur Zahlen von 0 - 6");
		}

	}

	private void pruefeSieg() {
		if (pruefeHorizontal() || pruefeVertikal() 
							   || pruefeDiagonalObenUnten()
							   || pruefeDiagonalUntenOben()) {
			isRunning = false;
		}
	}

	private boolean pruefeHorizontal() {
		for (int i = 0; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				if (j + 3 < this.spielfeld.length) {
					if (spielfeld[i][j] == spielfeld[i][j + 1] 
							&& spielfeld[i][j] == spielfeld[i][j + 2]
							&& spielfeld[i][j] == spielfeld[i][j + 3]
							&& spielfeld[i][j] != ' ') {
							gewinnStein = spielfeld[i][j];
							return true;
					} 
				}
			}
		}
		return false;
	}

	private boolean pruefeVertikal() {
		for (int i = 0; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				if (i + 3 < this.spielfeld.length) {
					if (spielfeld[i][j] == spielfeld[i + 1][j] 
							&& spielfeld[i][j] == spielfeld[i + 2][j]
							&& spielfeld[i][j] == spielfeld[i + 3][j] 
							&& spielfeld[i][j] != ' ') {
						gewinnStein = spielfeld[i][j];
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean pruefeDiagonalObenUnten() {
		for (int i = 0; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				if (i + 3 < this.spielfeld.length && j + 3 < this.spielfeld.length) {
					if (spielfeld[i][j] == spielfeld[i + 1][j + 1] 
							&& spielfeld[i][j] == spielfeld[i + 2][j + 2]
							&& spielfeld[i][j] == spielfeld[i + 3][j + 3] 
							&& spielfeld[i][j] != ' ') {
						gewinnStein = spielfeld[i][j];
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean pruefeDiagonalUntenOben() {
		for (int i = this.spielfeld.length - 1; i > 0; i--) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				if (i - 3 < this.spielfeld.length && j + 3 < this.spielfeld.length) {
					if (spielfeld[i][j] == spielfeld[i - 1][j + 1] 
							&& spielfeld[i][j] == spielfeld[i - 2][j + 2]
							&& spielfeld[i][j] == spielfeld[i - 3][j + 3] 
							&& spielfeld[i][j] != ' ') {
						gewinnStein = spielfeld[i][j];
						return true;
					}
				}
			}
		}
		return false;
	}

}
