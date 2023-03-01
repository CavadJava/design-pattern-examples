package az.design.pattern;
/**
 * @author KK JavaTutorials
 *This class initializes ChattingMediator &
 *userName in constructor so that subclass of this class
 *has to pass these values from their constructor
 *and implementation of methods sendMessage() & receiveMessage()
 *left on sub classes
 */
public abstract class User {

	private ChattingMediator chattingMediator;
	private String userName;
	
	public User(ChattingMediator chattingMediator, String userName) {
		super();
		this.chattingMediator = chattingMediator;
		this.userName = userName;
	}

	public ChattingMediator getChattingMediator() {
		return chattingMediator;
	}

	public String getUserName() {
		return userName;
	}
	
	public abstract void sendMessage(String message);
	public abstract void receiveMessage(String message);
}