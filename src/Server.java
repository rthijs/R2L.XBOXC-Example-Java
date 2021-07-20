import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	private static int PORT = 8099;
	
	private ServerSocket serverSocket;
	
	public void start() throws IOException {
		serverSocket = new ServerSocket(PORT);
		while(true) {
			new SocketInputHandler(serverSocket.accept()).start();
		}
	}
	
    public void stop() throws IOException {
        serverSocket.close();
    }

}
