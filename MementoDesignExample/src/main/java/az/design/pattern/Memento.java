package az.design.pattern;
/**
 * @author KK JavaTutorials
 *It contains the state of an object to be restored
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
}