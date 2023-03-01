package az.design.pattern;

/**
 * @author KK JavaTutorials
 *Client program which shows how Mediator
 *Design Pattern we use in Group Chat Application.
 */
public class ClientTest {

	public static void main(String[] args) {
		
		ChattingMediator  chattingMediator = new ChattingMediatorImpl();
		
		//Created few Users
		User user1 = new UserImpl(chattingMediator, "KK");
		User user2 = new UserImpl(chattingMediator, "PK");
		User user3 = new UserImpl(chattingMediator, "MK");
		User user4 = new UserImpl(chattingMediator, "SK");
		User user5 = new UserImpl(chattingMediator, "VK");
		
		//Adding many users in Group Chat
		chattingMediator.addUser(user1);
		chattingMediator.addUser(user2);
		chattingMediator.addUser(user3);
		chattingMediator.addUser(user4);
		chattingMediator.addUser(user5);
		
		//User PK sending message in Group Chat.
		user2.sendMessage("Hi,All");
	}

}