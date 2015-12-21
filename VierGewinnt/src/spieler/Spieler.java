package spieler;

public class Spieler {
	
	private String name;
	private char spielstein;
	
	public Spieler(String name, char spielstein){
		this.name = name;
		this.spielstein = spielstein;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSpielstein() {
		return spielstein;
	}

	public void setSpielstein(char spielstein) {
		this.spielstein = spielstein;
	}

}
