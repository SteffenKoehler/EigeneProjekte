package spieler;

import spielfeld.Spielfeld;;

public class SpielerO extends Spieler {

	private Spielfeld spielfeld;
	
	public SpielerO(String name) {
		this.name = name;
		this.symbol = 'O';
	}
	
	
	public void setzeStein(int feld){
		createStein(feld);
	}
	
	private void createStein(int feld){
		SymbolO stein = new SymbolO(feld);
	}
	
	private class SymbolO{
		private SymbolO(int feld){
			spielfeld.setzen(getSymbol() , feld);
		}
	}
	
}
