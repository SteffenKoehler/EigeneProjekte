import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spielfeld spielfeld = new Spielfeld();
		Scanner scanner = new Scanner(System.in);
		spielfeld.zeichneSpielfeld();
	
		spielfeld.setzeStein(3, 'O');
		spielfeld.setzeStein(3, 'O');
		spielfeld.setzeStein(3, 'X');
		spielfeld.setzeStein(3, 'X');
		spielfeld.setzeStein(3, 'O');
		spielfeld.setzeStein(3, 'X');
		spielfeld.setzeStein(3, 'X');
		spielfeld.setzeStein(3, 'O');
		spielfeld.setzeStein(3, 'S');
		
		
		while(Spielfeld.isRunning){
			spielfeld.setzeStein(scanner.nextInt(), 'X');
		}
		scanner.close();
		
		
	}

}
