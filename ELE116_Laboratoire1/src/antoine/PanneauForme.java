package antoine;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanneauForme extends JPanel{
	
	public PanneauForme(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		super.setVisible(true);
		super.setBackground(Color.WHITE);
	}
	
	protected void paintComponent(Graphics g) {
		g.drawOval(50, 50, 80, 80);
	}
}
