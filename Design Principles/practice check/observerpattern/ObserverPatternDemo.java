package ObserverPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		NotificationService server= new NotificationService();
		JohnObserver john= new JohnObserver();
		SteveObserver steve= new SteveObserver();
		server.addSubscriber(steve);
		server.addSubscriber(john);
		server.notifySubscriber();
		server.removeSubscriber(john);
		

	}

}