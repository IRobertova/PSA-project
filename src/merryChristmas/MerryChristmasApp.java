package merryChristmas;

public class MerryChristmasApp {

	public static void main(String[] args) {

		SantaClaus santaClaus = SantaClaus.getInstance();

		MagicBoard magicBoard = new MagicBoard();

		ToyCommand dollsCommand = new INeedDolls(magicBoard);
		ToyCommand wheelsCommand = new INeedWheels(magicBoard);

		Dwarf boardObserver1 = new Dwarf("Small Dwarf");
		Dwarf boardObserver2 = new Dwarf("Cool Dwarf");
		Dwarf boardObserver3 = new Dwarf("Lazy Dwarf");


		magicBoard.subscribe(boardObserver1);
		magicBoard.subscribe(boardObserver2);
		magicBoard.subscribe(boardObserver3);


		String message;
		message = santaClaus.postMessage("\"Ho-ho-ho! Hi, there! This is MerryChristmasApp!\"");

		santaClaus.setCommand(dollsCommand);
		santaClaus.iWant();

		System.out.println("----------------------------------------------------");

		santaClaus.setCommand(wheelsCommand);
		santaClaus.iWant();

	}

}
