package antoine;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PanneauControl extends JPanel{
	public PanneauControl() {
		this(0, 0, 700, 100);
	}
	
	public PanneauControl(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		super.setBackground(Color.CYAN);
		super.setVisible(true);
		super.setLayout(null);
		
		Bouton connect = new Bouton("BConnect", "Connexion", 580, 60, 100, 20);
		Bouton deconnect = new Bouton("BConnect", "DŽconnexion", 460, 60, 100, 20);
		final BoiteTexte adresseIp = new BoiteTexte("AIp", 100, 20, 100, 20);
		BoiteTexte port = new BoiteTexte("Port", 100, 43, 100, 20);
		Texte adresseIpLabel = new Texte("AddL", "Adresse IP : ", 20, 20, 100, 20);
		Texte portLabel = new Texte("PortL", "Port : ", 20, 43, 100, 20);
		
		super.add(connect);
		super.add(deconnect);
		super.add(adresseIp);
		super.add(port);
		super.add(adresseIpLabel);
		super.add(portLabel);
		
		connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Communication server = new Communication("127.0.0.1", 10000);
			}
		});
	}
	
	
}
