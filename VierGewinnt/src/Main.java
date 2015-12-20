import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static Spieler spieler1;
	static Spieler spieler2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spielfeld spielfeld = new Spielfeld();
		
		PvP();
		
		spielfeld.zeichneSpielfeld();
	
		
		
		while(Spielfeld.isRunning){
			System.out.println(spieler1.getName() + " dein Zug " + "(" + spieler1.getSpielstein() + ")");
			spielfeld.setzeStein(scanner.nextInt(), spieler1.getSpielstein());
			
			if(Spielfeld.isRunning){
				System.out.println(spieler2.getName() + " dein Zug " + "(" + spieler2.getSpielstein() + ")");
				spielfeld.setzeStein(scanner.nextInt(), spieler2.getSpielstein());
			}
		}
		gewinner(spielfeld);
		
		scanner.close();
		
		
	}
	
	private static void PvP(){
		System.out.println("Spieler 1, bitte Namen eingeben: ");
		spieler1 = new Spieler(scanner.nextLine(), '0');
		System.out.println("Hallo " + spieler1.getName() + " viel Spaﬂ beim Spiel.");
		System.out.println(spieler1.getName() + " dein Spielstein: " + spieler1.getSpielstein());
		System.out.println("_________________________");
		
		
		System.out.println("Spieler 2, bitte Namen eingeben: ");
		spieler2 = new Spieler(scanner.nextLine(), 'X');
		System.out.println("Hallo " + spieler2.getName() + " viel Spaﬂ beim Spiel.");
		System.out.println(spieler2.getName() + " dein Spielstein: " + spieler2.getSpielstein());
		System.out.println("_________________________");
	}
	
	private static void gewinner(Spielfeld spielfeld){
		
		if(spieler1.getSpielstein() == spielfeld.getGewinnStein()){
			System.out.println("Gewinner ist: " + spieler1.getName());
		}else{
			System.out.println("Gewinner ist: " + spieler2.getName());
		}
	}

}
