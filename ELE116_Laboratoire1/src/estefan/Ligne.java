package estefan;


public class Ligne extends Forme{

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Ligne() {
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	
	public Ligne(int pX1, int pY1,int pX2, int pY2 ) {
		x1 = pX1;
		y1 = pY1;
		x2 = pX2;
		y2 = pY2;
	}
	
	public void init(int a, int b, int c , int d){
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
	}
	
	
	public void dessine() {
		
		
	}

}
