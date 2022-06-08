package merryChristmas;

public interface Toy {
	
	Toy createStandartToy(String name);

	Toy createColorfulToy(String name, Color color);

	Toy create(String name, String color);

}
