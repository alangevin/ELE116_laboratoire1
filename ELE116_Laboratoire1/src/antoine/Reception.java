package antoine;

public class Reception extends Thread {
	
	public Communication serverReception = null;
	
	public Reception(Communication server) {
		this.serverReception = server;
	}
	
	public void run() {
		while(true) {
			System.out.println(serverReception.GetForme());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
