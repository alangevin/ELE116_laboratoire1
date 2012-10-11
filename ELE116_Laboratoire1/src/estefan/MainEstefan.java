package estefan;

public class MainEstefan {
	
	

	public static void main(String[] args) {
		
		Carre square = new Carre();
		Oval roundy = new Oval();
		Rectangle rect = new Rectangle();
		Ligne lines = new Ligne();
		String test = "10 <CERCLE> 15 15 65 76 </LIGNE> ";
		
		Forme formerecu = Createur.getForme(test);
		
		formerecu.dessine();
		
		
		
		
		
		
		
		
		
		
	}

}
