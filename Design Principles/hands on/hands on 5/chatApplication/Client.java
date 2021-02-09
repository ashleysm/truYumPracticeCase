package chatApplication;

public class Client {

	public static void main(String[] args) {
		ChatMediator mediator=new ChatMediator();
		IUser user1= new BasicUser("SreeDevi");
		IUser user2= new BasicUser("Abijith");
		IUser user3= new PremiumUser("Niranjana");
		IUser user4= new PremiumUser("Jaydev");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		IUser user5=new PremiumUser("Dileep");
		user5.sendMessage("HELLO Everyone!!");

	}

}
