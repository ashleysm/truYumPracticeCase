package popularEvent;

public class AdminObserver2 implements Observer{

String name;
	
	public AdminObserver2() {
		
		this.name ="Admin2";
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
