package Spielstein;

public abstract class Spielstein {

	protected char symbol;
	
	public char getSymbol(){
		return this.symbol;
	}
	
	@Override
	public String toString() {
		return "" + this.symbol;
	}
}
