package az.design.pattern;
/**
 * @author KK JavaTutorials
 *This class passing values of instance chattingMediator
 *& userName to super class User and overridden 
 * methods sendMessage & receiveMessage
 * to fulfill.
 * Method sendMessage -- > Send message in group chat
 * Method receiveMessage -- > receive message by every user in group chat
 */
public class UserImpl extends User {

	private ChattingMediator chattingMediator;
	private String userName;
	
	public UserImpl(ChattingMediator chattingMediator, String userName) {
		super(chattingMediator, userName);
		this.chattingMediator = chattingMediator;
		this.userName = userName;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(userName + " sending message = "+message);
		chattingMediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(userName + " received message = "+message);
	}

}