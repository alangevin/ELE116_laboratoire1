package antoine;

import java.awt.Color;

import javax.swing.JPanel;

public class PanneauPrincipal extends JPanel {
	
	public PanneauPrincipal() {
		this(0, 0, 700, 700);
	}
	
	public PanneauPrincipal(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		super.setBackground(Color.YELLOW);
		super.setVisible(true);
		super.setLayout(null);
		
		PanneauControl paneControl = new PanneauControl(0, 0, 700, 100);
		PanneauLog paneLog = new PanneauLog();
		
		this.add(paneControl);
		this.add(paneLog);
	}
}
