package Singleton;

public class Main {

	public static void main(String[] args) {
		DBConn instance1=DBConn.getInstance();
		System.out.println(instance1);
	}
}