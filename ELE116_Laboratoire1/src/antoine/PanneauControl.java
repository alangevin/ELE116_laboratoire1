package antoine;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PanneauControl extends JPanel{
	public Communication server = null;
	public Bouton connect = null;
	public Bouton deconnect = null;
	public BoiteTexte adresseIp = null;
	public BoiteTexte port = null;
	public Reception boucleReception = null;
	
	public PanneauControl() {
		this(0, 0, 700, 100);
	}
	
	public PanneauControl(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		super.setBackground(Color.CYAN);
		super.setVisible(true);
		super.setLayout(null);
		
		connect = new Bouton("BConnect", "Connexion", 580, 60, 100, 20);
		deconnect = new Bouton("BConnect", "Deconnexion", 450, 60, 110, 20);
		adresseIp = new BoiteTexte("AIp", 100, 20, 100, 20);
		port = new BoiteTexte("Port", 100, 43, 100, 20);
		Texte adresseIpLabel = new Texte("AddL", "Adresse IP : ", 20, 20, 100, 20);
		Texte portLabel = new Texte("PortL", "Port : ", 20, 43, 100, 20);
		
		adresseIp.setText("127.0.0.1");
		port.setText("10000");
		
		deconnect.setEnabled(false);
		
		super.add(connect);
		super.add(deconnect);
		super.add(adresseIp);
		super.add(port);
		super.add(adresseIpLabel);
		super.add(portLabel);
		
		connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				server = new Communication(adresseIp.getText(), Integer.valueOf(port.getText()));
				boucleReception = new Reception(server);
				connect.setEnabled(false);
				deconnect.setEnabled(true);
			}
		});
		
		deconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				server.CloseCommunication();
				connect.setEnabled(true);
				deconnect.setEnabled(false);
			}
		});
	}
	
	
}
