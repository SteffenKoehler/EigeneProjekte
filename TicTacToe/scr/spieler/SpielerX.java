package spieler;

import Spielstein.XSpielstein;

public class SpielerX extends Spieler {

	public SpielerX(String name) {
		this.name = name;
		this.spielstein = new XSpielstein();
	}

}
