package az.design.pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * @author KK JavaTutorials
 *Implelementation of ChattingMediator
 *which add users in group chat and
 *send message by user in group
 * 
 */
public class ChattingMediatorImpl implements ChattingMediator {

	private List<User> userList;
	
	public ChattingMediatorImpl() {
		userList = new ArrayList<User>();
	}
	@Override
	public void sendMessage(String message, User user) {
		for (User u : userList) {
			if(!u.getUserName().equalsIgnoreCase(user.getUserName())) {
				u.receiveMessage(message);
			}
		}

	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}

}