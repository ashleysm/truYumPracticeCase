package messagePublisher;

public interface Observer {

	public void update(Message m);
	public void updateState(State s);
}