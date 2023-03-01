package az.design.pattern;

/**
 * @author KK JavaTutorials
 * Client program to use implementaed
 * Memento Design Pattern
 */
public class ClientTest {

	public static void main(String args[]) {
		
		//Create an object of Originator
		Originator originator = new Originator();
		
		//Create an object of CareTaker
		CareTaker careTaker = new CareTaker();

		//Intially setting states in originator
		originator.setState("State - 1");
		originator.setState("State - 2");
		
		//Saving originator states in careTaker
		careTaker.add(originator.saveStateToMemento());

		//adding one more state originator
		originator.setState("State - 3");
		
		//Save this state in careTaker
		careTaker.add(originator.saveStateToMemento());

		//adding latest state originator
		originator.setState("State - 4");
		System.out.println("Current State is: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State was: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State was: " + originator.getState());
	}
}