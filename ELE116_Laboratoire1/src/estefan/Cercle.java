package estefan;

public class Cercle extends Forme {

	private int x1;
	private int y1;
	private int rayon;
	

	
	public Cercle () {
		x1 = 0;
		y1 = 0;
		rayon = 0;
		
	}
	
	public Cercle (int pX1, int pY1,int pX2 ) {
		x1 = pX1;
		y1 = pY1;
		rayon = pX2;
		
	}
	
	public void init(int x1, int y1,int rayon ){
		this.x1 = x1;
		this.y1 = y1;
		this.rayon = rayon;
		
	}
	
	
	public void dessine() {
		
		
	}
	

}
