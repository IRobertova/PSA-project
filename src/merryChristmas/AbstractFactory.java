package merryChristmas;

public abstract class AbstractFactory {
	
	abstract Color createColor(String name);

	abstract Toy createStandartToy(String name);

	abstract Toy createColorfulToy(String name);
	
	abstract Toy createPurpleToy(String name);


}
