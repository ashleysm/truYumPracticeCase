package Automobiles;

public class Client {

	public static void main(String[] args) {
	
		AudiFactory audi=new AudiFactory();
		audi.makeHeadlight();
		audi.makeTire();
		
		MercedesFactory mercedes=new MercedesFactory();
		mercedes.makeHeadlight();
		mercedes.makeTire();

	}

}