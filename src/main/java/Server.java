import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	private static int PORT = 8099;

	private ServerSocket serverSocket;

	public void start() {
		try {
			serverSocket = new ServerSocket(PORT);
			while (true) {
				new SocketInputHandler(serverSocket.accept()).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
