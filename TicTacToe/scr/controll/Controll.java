package controll;

import java.util.Scanner;

import Spielstein.DefaultSpielstein;
import Spielstein.Spielstein;
import spieler.Spieler;
import spieler.SpielerO;
import spieler.SpielerX;
import spielfeld.Spielfeld;

public class Controll {

	private static Spielfeld spielfeld = new Spielfeld();
	Scanner sc = new Scanner(System.in);
	Spieler spieler;
	Spielstein spielstein;
	DefaultSpielstein defaultspielstein = new DefaultSpielstein();

	public Controll(){
		//Def-Konstruktor
	}
	
	public Controll(SpielerO spielerO, SpielerX spielerX) {
		this.spielAblauf(spielerO, spielerX);
	}

	private void spielAblauf(SpielerO spielerO, SpielerX spielerX){
		while (true) {
			spielfeld.printSpielfeld();
			spielerO.setzeStein(sc.nextInt());
			istSpielGewonnen(spielerO);
			spielfeld.printSpielfeld();
			spielerX.setzeStein(sc.nextInt());
			istSpielGewonnen(spielerX);
		}
	}
	
	public void korrekterZug(Spieler spieler, int feld) {

		if (istZugmoeglich(feld)) {
			Spielfeld.spielfeld[feld] = spieler.getSpielstein();
		} else {
			this.korrekterZug(spieler, sc.nextInt());
		}

	}

	private boolean istZugmoeglich(int feld) {
		if (feld < 1 || feld > 9) {
			System.out.println("Bitte eine Zahl zwischen 1 und 9 eingeben");
			return false;
		} else if (Spielfeld.spielfeld[feld].getSymbol() != (defaultspielstein
				.getSymbol())) {
			System.out.println("Bitte ein freies Feld wählen");
			return false;
		} else {
			return true;
		}
	}

	public boolean istSpielGewonnen(Spieler spieler) {
		if (siegDiagonal(spieler)) {
			gewinnerAusgabe(spieler);
		} else if (siegHorizontal(spieler)) {
			gewinnerAusgabe(spieler);
		} else if (siegVertikal(spieler)) {
			gewinnerAusgabe(spieler);
		}
		return false;
	}
	
	private void gewinnerAusgabe(Spieler gewinner) {
		System.out.println("Sieger ist: " + gewinner.getName()
				+ gewinner.getSpielstein().getSymbol());
	}

	private boolean siegDiagonal(Spieler spieler) {
		if (Spielfeld.spielfeld[1].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[5].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[9].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		} else if (Spielfeld.spielfeld[3].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[5].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[7].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean siegHorizontal(Spieler spieler) {
		if (Spielfeld.spielfeld[1].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[2].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[3].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		} else if (Spielfeld.spielfeld[4].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[5].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[6].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		} else if (Spielfeld.spielfeld[7].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[8].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[9].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean siegVertikal(Spieler spieler) {
		if (Spielfeld.spielfeld[1].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[4].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[7].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		} else if (Spielfeld.spielfeld[2].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[5].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[8].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		} else if (Spielfeld.spielfeld[3].equals(spieler.getSpielstein())) {
			if (Spielfeld.spielfeld[6].equals(spieler.getSpielstein())) {
				if (Spielfeld.spielfeld[9].equals(spieler.getSpielstein())) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((spieler == null) ? 0 : spieler.hashCode());
		result = prime * result
				+ ((spielstein == null) ? 0 : spielstein.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Controll other = (Controll) obj;
		if (spieler == null) {
			if (other.spieler != null)
				return false;
		} else if (!spieler.equals(other.spieler))
			return false;
		if (spielstein == null) {
			if (other.spielstein != null)
				return false;
		} else if (!spielstein.equals(other.spielstein))
			return false;
		return true;
	}

	
	
}
