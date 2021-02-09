package Automobiles;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
	 return new AudiTire();
	}
	
	public AudiFactory() {
		System.out.println("Audi Factory");
	}

}