
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spielfeld spielfeld = new Spielfeld();
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
		
		
		spielfeld.setzeStein(1, 'O');
		spielfeld.setzeStein(1, 'X');
		spielfeld.setzeStein(4, 'O');
		spielfeld.setzeStein(6, 'O');
		spielfeld.setzeStein(2, 'X');
		spielfeld.setzeStein(5, 'X');
		
		spielfeld.setzeStein(2, 'O');
		spielfeld.setzeStein(4, 'O');
		
		spielfeld.setzeStein(0, 'X');
		spielfeld.setzeStein(0, 'X');
		spielfeld.setzeStein(0, 'O');
		spielfeld.setzeStein(0, 'O');
		spielfeld.setzeStein(0, 'O');
		spielfeld.setzeStein(0, 'O');
		
	}

}
