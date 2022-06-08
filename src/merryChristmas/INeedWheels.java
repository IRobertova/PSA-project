package merryChristmas;

public class INeedWheels implements ToyCommand {

	private MagicBoard board;

	public INeedWheels(MagicBoard board) {
		super();
		this.board = board;
	}

	@Override
	public void execute() {
		System.out.println("Santa said: \"I need wheels!\" ");
		this.board.INeedWheels();
	}

	@Override
	public void stop() {
		System.out.println("Santa said: \"I need dolls!\" ");
		this.board.INeedDolls();
	}
}
