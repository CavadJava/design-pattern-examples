package az.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KK JavaTutorials
 *This object is responsible to restore object state from Memento.
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}