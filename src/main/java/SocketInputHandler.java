import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketInputHandler extends Thread {

	private Socket clientSocket;
	private BufferedReader in;
	private ControllerInputHandler inputHandler;

	public SocketInputHandler(Socket socket, ControllerInputHandler inputHandler) {
		this.clientSocket = socket;
		this.inputHandler = inputHandler;
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String inputLine;
			
			while ((inputLine = in.readLine()) != null) {
				inputHandler.handleSocketInput(inputLine);
			}
			
			in.close();
			clientSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
