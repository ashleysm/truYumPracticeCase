package ObserverPattern;

public class JohnObserver implements INotificationObserver {

private String name;
	
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JohnObserver()
	{
		name="John";
	}
	@Override
	public void OnServerDown() {
		System.out.println(name+" :: Received");
		
	}
}
