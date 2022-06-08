package merryChristmas;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

	private boolean chooseToy;
	private List<BoardObserver> observers = new ArrayList<>();

	public void INeedDolls() {
		System.out.println("Magic Board: Doll!");
		this.chooseToy = true;
		this.notifyObservers();
	}

	public void INeedWheels() {
		System.out.println("Magic Board: Wheel!");
		this.chooseToy = false;
		this.notifyObservers();
	}

	@Override
	public void subscribe(BoardObserver boardObserver) {
		this.observers.add(boardObserver);
		boardObserver.setTopic(this);
	}

	@Override
	public void unsubscribe(BoardObserver boardObserver) {
		this.observers.remove(boardObserver);
		boardObserver.setTopic(null);
	}

	@Override
	public void notifyObservers() {
		for (BoardObserver boardObserver : this.observers) {
			boardObserver.update();
		}
	}

	@Override
	public Boolean getUpdate() {
		// TODO Auto-generated method stub
		return this.chooseToy;
	}
}
