package popularEvent;

public class AdminObserver3 implements Observer{
String name;
	
	public AdminObserver3() {
		
		this.name ="Admin3";
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