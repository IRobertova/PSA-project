package merryChristmas;

public class Workshop extends AbstractFactory {

	@Override
	Color createColor(String name) {
		if (name.equalsIgnoreCase("Colorful")) {
			return new MultiColor(name);
		}
		if (name.equalsIgnoreCase("Purple")) {
			return new PurpleColor(name);
		}
		return null;
	}

	@Override
	Toy createStandartToy(String toyName) {
		if (toyName.equalsIgnoreCase("Doll")) {
			return new Doll().createStandartToy(toyName);
		}
		if (toyName.equalsIgnoreCase("Wheel")) {
			return new Wheel().createStandartToy(toyName);
		}
		return null;
	}

	@Override
	Toy createColorfulToy(String toyName) {
		if (toyName.equalsIgnoreCase("Doll")) {
			return new Doll().createColorfulToy(toyName, createColor("Colorful"));
		}
		if (toyName.equalsIgnoreCase("Wheel")) {
			return new Wheel().createColorfulToy(toyName, createColor("Colorful"));
		}
		return null;
	}

	@Override
	Toy createPurpleToy(String toyName) {
		if (toyName.equalsIgnoreCase("Doll")) {
			return new Doll().createColorfulToy(toyName, createColor("Purple"));
		}
		if (toyName.equalsIgnoreCase("Wheel")) {
			return new Wheel().createColorfulToy(toyName, createColor("Purple"));
		}
		return null;
	}

}
