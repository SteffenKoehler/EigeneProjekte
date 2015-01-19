package spieler;

import java.util.Scanner;

import spielfeld.Spielfeld;

public abstract class Spieler {
	
	protected String name;
	protected char symbol;
	Scanner sc = new Scanner(System.in);
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public char getSymbol(){
		return this.symbol;
	}
	
	public void setzeStein(int feld) {
		if (Spielfeld.spielfeld[feld] == '_') {
			Spielfeld.spielfeld[feld] = this.getSymbol();
		} else {
			System.out
					.println("Setzen nicht möglich, bitte richtiges Feld wählen");
			this.setzeStein(sc.nextInt());
		}

	}
	
	@Override
	public String toString(){
		return "Spieler: " + this.getName() + " " + "[" + this.getSymbol() + "]";
		
	}

}
