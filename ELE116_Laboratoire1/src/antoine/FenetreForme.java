package antoine;

import javax.swing.JFrame;

public class FenetreForme extends JFrame {
	
	public FenetreForme(String titre, int x, int y, int width, int height) {
		super.setTitle(titre);
		super.setBounds(x+700, y, width, height);
		super.setVisible(true);
		super.setLayout(null);
		super.setResizable(false);
		super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	
		PanneauForme paneForme = new PanneauForme(0, 0, width, height);
		
		super.setContentPane(paneForme);
	}
	
	
}
