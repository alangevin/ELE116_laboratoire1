package antoine;

import javax.swing.JTextArea;

public class ZoneTexte extends JTextArea{
	
	public ZoneTexte(int id, int x, int y, int width, int height) {
		super.setVisible(true);
		super.setBounds(x, y, width, height);
		super.setEditable(false);
	}
}
