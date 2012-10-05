package antoine;

import javax.swing.JButton;

public class Bouton extends JButton {
	
	public Bouton(String id, String text, int x, int y, int width, int height) {
		this.setText(text);
		this.setBounds(x, y, width, height);
	}
}
