package ObserverPattern;

public class SteveObserver implements INotificationObserver {

	private String name;
	
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SteveObserver()
	{
		name="Steve";
	}
	@Override
	public void OnServerDown() {
		System.out.println(name+" :: Received");
		
	}

}