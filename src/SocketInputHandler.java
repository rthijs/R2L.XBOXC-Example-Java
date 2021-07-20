import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketInputHandler extends Thread {

	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;

	public SocketInputHandler(Socket socket) {
		this.clientSocket = socket;
	}

	public void run() {
		try {
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				if (".".equals(inputLine)) {
					out.println("bye");
					break;
				}
				out.println(inputLine);
				System.out.println(inputLine);
			}
			
			in.close();
			out.close();
			clientSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
