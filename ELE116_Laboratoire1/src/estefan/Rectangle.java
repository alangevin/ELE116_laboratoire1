package estefan;


public class Rectangle extends Forme{
	int x1;
	int y1;
	int x2;
	int y2;
	
	public  Rectangle() {
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	
	public Rectangle(int pX1, int pY1,int pX2, int pY2 ) {
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
