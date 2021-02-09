package chatApplication;

public class BasicUser implements IUser {

	public static ChatMediator mediator=new ChatMediator();
	private String name;
	public BasicUser(String name) {
		super();
		this.name = name;
	}
	@Override
	public void sendMessage(String msg) {
		mediator.sendMessage(msg);
		
	}
	@Override
	public void receiveMessage(String msg) {
		System.out.println(name+" :: "+msg);
		
	}
	
}
