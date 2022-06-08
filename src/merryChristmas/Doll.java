package merryChristmas;

public class Doll implements Toy {

	private String name;
	private String color;
	private Color col;
	private Workshop santasWorkshop = new Workshop();

	public Doll() {
	}

	public Doll(String name) {
		this.name = name;
	}

	public Doll(String name, String color) {
		this.name = name;
		this.color = color;

	}

	public Doll(String name, Color col) {
		this.name = name;
		this.col = col;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public Toy createStandartToy(String name) {
		System.out.println(name + " has been created!");
		return new Doll(name);
	}

	@Override
	public Toy createColorfulToy(String name, Color color) {
		System.out.println(color.getName() + " " + name + " has been created!");
		return new Doll(name, color);
	}

	// Това не се използва---------->
	@Override
	public Toy create(String name, String color) {
		System.out.println(color + " " + name + " has been created!");
		Color col1 = santasWorkshop.createColor("Purple");
		Color col2 = santasWorkshop.createColor("Colorful");

		if (color.equalsIgnoreCase(col1.getName())) {
			return new Doll(name, col1);
		} else if (color.equalsIgnoreCase(col2.getName())) {
			return new Doll(name, col2);
		} else
			return new Doll(name, color);
	}

}
