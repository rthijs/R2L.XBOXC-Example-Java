public class Main {
	public static void main(String[] args) {
		ControllerInputHandler inputHandler = new ControllerInputHandlerImpl();
		new Server().start(inputHandler);
	}
}
