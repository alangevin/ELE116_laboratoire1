package antoine;

import javax.swing.JFrame;

public class FenetreControle extends JFrame {
	
	public FenetreControle() {
		this("DŽfaut", 500, 500);
	}
	
	public FenetreControle(String titre, int width, int height) {
		super.setSize(width, height);
		super.setTitle(titre);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLayout(null);
		
		PanneauPrincipal panePrincipal = new PanneauPrincipal(0, 0, 700, 700);
		
		super.setContentPane(panePrincipal);
		
	}
}
