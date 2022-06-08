package merryChristmas;

import java.util.Random;

public class Dwarf implements BoardObserver {

	private Workshop santasWorkshop = new Workshop();
	private Observable topic;
	private Boolean chooseToy;
	private String name;

	public Dwarf(String name) {
		this.name = name;
	}

	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}

	@Override
	public void update() {
		if (this.topic == null) {
			System.out.println(this.getName() + " Has no topic set");
			return;
		}

		this.chooseToy = this.topic.getUpdate();
		if (chooseToy == false) {
			System.out.println();

			int random = new Random().nextInt(3);
			if (random == 0) {
				System.out.println(this.getName() + " received: \"Wheel\"");
				santasWorkshop.createColorfulToy("Wheel");
			} else if (random == 1) {
				System.out.println(this.getName() + " received: \"Wheel\"");
				santasWorkshop.createPurpleToy("Wheel");
			} else if (random == 2) {
				System.out.println(this.getName() + " received: \"Wheel\"");
				santasWorkshop.createStandartToy("Wheel");
			}
			//System.out.println();

		} else {
			System.out.println();
			int random = new Random().nextInt(3);
			if (random == 0) {
				System.out.println(this.getName() + " received: \"Doll\"");
				santasWorkshop.createColorfulToy("Doll");

			} else if (random == 1) {
				System.out.println(this.getName() + " received: \"Doll\"");
				santasWorkshop.createPurpleToy("Doll");

			} else if (random == 2) {
				System.out.println(this.getName() + " received: \"Doll\"");
				santasWorkshop.createStandartToy("Doll");
			}
			//System.out.println();

		}

	}

	public String getName() {
		return name;
	}

}
