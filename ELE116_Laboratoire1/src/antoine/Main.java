package antoine;

import java.io.PrintStream;

public class Main {

	static PrintStream log = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FenetreControle fenetre = new FenetreControle("Laboratoire 1", 700, 700);
		FenetreForme fenetreForme = new FenetreForme("Forme", fenetre.getX(), fenetre.getY(), 500, 500);
	}

}
