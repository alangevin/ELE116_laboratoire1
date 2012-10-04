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
			
			System.out.println("Connexion � " + adresseIP + ":" + port);
			
			dout = new PrintWriter(socketClient.getOutputStream(), true);
			din = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Connexion �chou�e");
		} catch (Exception e) {
			System.out.println("Connexion �chou�e");
		} finally {
			try {
				din.close();
				dout.close();
				socketClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Connexion �chou�e");
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
		
		try {
			din.close();
			dout.close();
			socketClient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}