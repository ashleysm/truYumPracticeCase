package popularEvent;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<Observer> adminList=new ArrayList<>();
	@Override
	public void addSubscriber(Observer ob) {
		adminList.add(ob);
		System.out.println("Added "+ob.getName());
		
	}

	@Override
	public void removeSubscriber(Observer ob) {
		adminList.remove(ob);
		System.out.println("Removed "+ob.getName());
		
	}

	@Override
	public void notifySubscriber() {
	
		for(Observer admin :adminList ) {
			admin.popularEventNotification();
		}
		
	}

}
