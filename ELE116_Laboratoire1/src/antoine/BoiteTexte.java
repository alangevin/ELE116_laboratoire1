package antoine;

import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class BoiteTexte extends JTextField{
	
	public BoiteTexte(String id, int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		super.setSize(width, height);
		super.setVisible(true);
		super.setEnabled(true);
	}
}
