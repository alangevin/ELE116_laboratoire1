package estefan;


public class Oval extends Forme{

	private int x1;
	private int y1;
	private int rayonh;
	private int rayonv;
	
	public Oval () {
		x1 = 0;
		y1 = 0;
		rayonh = 0;
		rayonv = 0;
	}
	
	public Oval (int pX1, int pY1,int pX2, int pY2 ) {
		x1 = pX1;
		y1 = pY1;
		rayonh = pX2;
		rayonv= pY2;
	}
	
	public void init(int a, int b, int c , int d){
		x1 = a;
		y1 = b;
		rayonh = c;
		rayonv= d;
	}
	
	
	public void dessine() {
		
		
	}

}
