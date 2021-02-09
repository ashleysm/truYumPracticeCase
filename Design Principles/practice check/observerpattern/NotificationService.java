package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	public List<INotificationObserver> subscribers= new ArrayList<>(); 
	@Override
	public void addSubscriber(INotificationObserver ob) {
		subscribers.add(ob);
		System.out.println("Added "+ob.getName());
		
	}

	@Override
	public void removeSubscriber(INotificationObserver ob) {
		subscribers.remove(ob);
		System.out.println("Removed "+ob.getName());
		
	}

	@Override
	public void notifySubscriber() {
		for(INotificationObserver subscriber: subscribers) {
			subscriber.OnServerDown();
		}
		
	}

}