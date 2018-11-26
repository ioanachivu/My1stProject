package headFirstJava.socketConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketConnectionClient {

	public void go() {
		try {
			Socket s = new Socket("127.0.0.1", 4242);
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(streamReader);
			
			String advice = br.readLine();
			System.out.println("Today you should: " + advice);
			
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		SocketConnectionClient scc = new SocketConnectionClient();
		scc.go();

	}

}
