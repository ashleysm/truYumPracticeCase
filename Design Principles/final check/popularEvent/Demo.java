package popularEvent;

public class Demo {

	public static void main(String[] args) {
		AdminObserver1 admin1= new AdminObserver1();
		AdminObserver2 admin2= new AdminObserver2();
		AdminObserver3 admin3= new AdminObserver3();
		
		NotificationService publisher=new NotificationService();
		publisher.addSubscriber(admin1);
		publisher.addSubscriber(admin2);
		publisher.addSubscriber(admin3);
		publisher.notifySubscriber();
		publisher.removeSubscriber(admin2);
	}
}