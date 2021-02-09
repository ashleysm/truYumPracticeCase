package Singleton;

public class DBConn {

	private static DBConn instance;
	
	private DBConn() {
		
	}
	
	public static DBConn getInstance() {
		return instance;
	}
}