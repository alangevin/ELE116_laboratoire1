package antoine;

import java.awt.Font;

import javax.swing.JLabel;

public class Texte extends JLabel{
	
	public Texte(String id, String text, int x, int y, int width, int height) {
		super.setText(text);
		super.setBounds(x, y, width, height);
	}
}
