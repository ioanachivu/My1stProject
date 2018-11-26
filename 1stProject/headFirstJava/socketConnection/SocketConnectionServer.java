package headFirstJava.socketConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketConnectionServer {

	String[] adviceList = {"Take smaller bites", "Smile often", "Believe in yourself",
			"Remember who you are", "Look at the sky"};
	
	public void go() {
		try {
			ServerSocket serverSocket = new ServerSocket(4242);
			
			while(true) {
				Socket socket = serverSocket.accept();
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				String advice = getAdvice();
				pw.println(advice);
				pw.close();
				System.out.println(advice);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private String getAdvice() {
		int random = (int) (Math.random()*adviceList.length);
		return adviceList[random];
	}
	
	public static void main(String[] args) {
		SocketConnectionServer scs = new SocketConnectionServer();
		scs.go();
	}
}
