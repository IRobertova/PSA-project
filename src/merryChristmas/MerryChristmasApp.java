package merryChristmas;

public class MerryChristmasApp {

	public static void main(String[] args) {

		MagicBoard magicBoard = new MagicBoard();

		Workshop santaWorkshop = new Workshop();

		ToyCommand command1 = new INeedDolls(magicBoard);
		ToyCommand command2 = new INeedWheels(magicBoard);

		Dwarf boardObserver1 = new Dwarf("Small Dwarf");
		Dwarf boardObserver2 = new Dwarf("Cool Dwarf");

		magicBoard.subscribe(boardObserver1);
		magicBoard.subscribe(boardObserver2);

		SantaClaus santaClaus = SantaClaus.getInstance();
		String message;
		message = santaClaus.postMessage("\"Ho-ho-ho!\"");

		santaClaus.setCommand(command1);
		santaClaus.iWant();

		System.out.println("------------------------------------------");

		santaClaus.setCommand(command2);
		santaClaus.iWant();

	}

}
