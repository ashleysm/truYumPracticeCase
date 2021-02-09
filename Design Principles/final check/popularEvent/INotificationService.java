package popularEvent;

public interface INotificationService {

	public void addSubscriber(Observer ob);
	public void removeSubscriber(Observer ob);
	public void notifySubscriber();
}