package antoine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Communication {
	private Socket socketClient = null;
	private PrintWriter dout = null;
	private BufferedReader din = null;
	
	public Communication() {
		this("127.0.0.1", 10000);
		
	}
	
	public Communication(String adresseIP, int port) {
		try {
			socketClient = new Socket(adresseIP, port);
			
			dout = new PrintWriter(socketClient.getOutputStream(), true);
			din = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
			
			System.out.println("Connexion a " + adresseIP + ":" + port);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Connexion echouee");
		}
	}
	
	public String GetForme() {
		String strForme = null;
		
		dout.println("GET");
		
		
		try {
			strForme = din.readLine();
			strForme = din.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(strForme == null) {
				strForme = "Erreur de lecture de forme sur le serveur";
			}
			return strForme;
		}
	}
	
	public void CloseCommunication() {
		dout.println("END");
		
		System.out.println("Deconnexion du serveur");
		try {
			din.close();
			dout.close();
			socketClient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
