package popularEvent;

public class AdminObserver1 implements Observer {

	String name;
	
	public AdminObserver1() {
		
		this.name ="Admin1";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void popularEventNotification() {
		System.out.println(name+" :: Received Notification");
		
	}

}
