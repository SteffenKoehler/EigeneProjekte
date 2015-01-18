package spieler;

import spielfeld.Spielfeld;

public abstract class Spieler {
	
	protected String name;
	protected char symbol;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public char getSymbol(){
		return this.symbol;
	}
	
	public void setzeStein(int feld){
		Spielfeld.spielfeld[feld] = this.getSymbol();
	}
	
	@Override
	public String toString(){
		return "Spieler: " + this.getName() + " " + "[" + this.getSymbol() + "]";
		
	}

}
