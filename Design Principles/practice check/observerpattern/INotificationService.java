package ObserverPattern;

public interface INotificationService {

	public void addSubscriber(INotificationObserver ob);
	public void removeSubscriber(INotificationObserver ob);
	public void notifySubscriber();
}