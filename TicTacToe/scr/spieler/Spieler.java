package spieler;

import java.util.Scanner;

import controll.Controll;

public abstract class Spieler {
	
	private Spieler spieler;
	protected String name;
	protected char symbol;
	private Controll controll = new Controll();
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
	
	public Spieler getSpieler(){
		return this.spieler;
	}
	
	public void setzeStein(int feld) {
		controll.korrekterZug(this, feld);
	}
	
	
	
	@Override
	public String toString(){
		return "Spieler: " + this.getName() + " " + "[" + this.getSymbol() + "]";
		
	}

}
