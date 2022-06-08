package merryChristmas;

public class INeedDolls implements ToyCommand {
	
	private MagicBoard board;

	public INeedDolls(MagicBoard board) {
		super();
		this.board = board;
	}

	@Override
	public void execute() {
		System.out.println("Santa said: \"I need dolls!\" ");
		this.board.INeedDolls();
	}

	@Override
	public void stop() {
		System.out.println("Santa said: \"I need wheels!\" ");
		this.board.INeedWheels();
	}
}
