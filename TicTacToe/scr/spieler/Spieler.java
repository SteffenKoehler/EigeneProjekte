package spieler;

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
	
	@Override
	public String toString(){
		return "Spieler: " + this.getName() + " " + "[" + this.getSymbol() + "]";
		
	}

}
