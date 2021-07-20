import java.io.IOException;

public class Main {
	
	static Server server = new Server();
	
	public static void main(String[] args) {
		try {
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
