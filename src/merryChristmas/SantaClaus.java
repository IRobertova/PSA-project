package merryChristmas;

public class SantaClaus {

	private static SantaClaus instance;

	private ToyCommand command;

	private SantaClaus() {

	}

	public static SantaClaus getInstance() {
		if (instance == null) {
			instance = new SantaClaus();
		}
		return instance;
	}

	public ToyCommand getCommand() {
		return command;
	}

	public void setCommand(ToyCommand command) {
		this.command = command;
	}

	public String postMessage(String message) {

		System.out.println("Santa said: " + message);
		System.out.println("------------------------------------------");

		return message;
	}

	public void iWant() {
		if (this.command == null) {
			System.out.println("Santa doesn't want anything");
			return;
		}
		this.command.execute();
	}
}
