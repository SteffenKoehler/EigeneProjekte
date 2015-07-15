package spieler;

import Spielstein.OSpielstein;

public class SpielerO extends Spieler {

	public SpielerO(String name) {
		this.name = name;
		this.spielstein = new OSpielstein();
	}

}
