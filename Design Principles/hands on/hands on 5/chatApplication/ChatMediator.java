package chatApplication;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private static List<IUser> userList;

	public ChatMediator() {
		
	userList = new ArrayList<IUser>();
	}

	public List<IUser> getUserList() {
		return userList;
	}

	

	@Override
	public void addUser(IUser user) {
		userList.add(user);
		
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("Chat Mediator Loading...");
		for(IUser user: userList) {
			user.receiveMessage(msg);
			
		}
		
	}
	
}