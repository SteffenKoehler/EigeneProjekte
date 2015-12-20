
public class Spielfeld {

	private char [][] spielfeld;

	public Spielfeld() {
		this.spielfeld = new char [7][7];
		fuelleSpielfeld();
	}
	
	private void fuelleSpielfeld(){
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				this.spielfeld[i][j] = Character.forDigit(j, 10);
			}
		}
		
		for (int i = 1; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld[i].length; j++) {
				this.spielfeld[i][j] = ' ';
			}
		}
	}
	
	public void zeichneSpielfeld(){
		
		//Zahlen
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				System.out.print(" " + this.spielfeld[i][j] + " ");
			}
			System.out.println("");
		}
		
		//Steine
		for (int i = 1; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld[i].length; j++) {
				System.out.print("[" + this.spielfeld[i][j] + "]");
			}
			System.out.println("");
		}
		System.out.println("_________________________");
	}
	
	public void setzeStein(int position, char stein){
		System.out.println(this.spielfeld.length);
		
		for (int i = this.spielfeld.length - 1; i > 0; i--) {
			if(this.spielfeld[i][position] == ' '){
				this.spielfeld[i][position] = stein;
				stein = ' ';
			}
		}
		zeichneSpielfeld();
		pruefeSieg();
	}
	
	private void pruefeSieg(){
		System.out.println("Horizontal: " + pruefeHorizontal());
		System.out.println("Vertikal: " + pruefeVertikal());
	}
	
	private boolean pruefeHorizontal(){
		int counter = 0;
		
		for (int i = 0; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				if(j+1 < this.spielfeld.length){
					if(spielfeld[i][j] == spielfeld[i][j+1] && spielfeld[i][j] != ' '){
						counter++;
						if(counter == 3){
							return true;
						}
					}
					else{
						counter = 0;
					}
					
				}
			}
		}
		return false;
	}
	
	
	private boolean pruefeVertikal(){
		for (int i = 0; i < this.spielfeld.length; i++) {
			for (int j = 0; j < this.spielfeld.length; j++) {
				if(i+3 < this.spielfeld.length){
					if(spielfeld[i][j] == spielfeld[i+1][j]
							&& spielfeld[i][j] == spielfeld[i+2][j]
							&& spielfeld[i][j] == spielfeld[i+3][j]
							&& spielfeld[i][j] != ' '){
							return true;
						}
					}
					
					
				}
			}
		return false;
	}
	
}
