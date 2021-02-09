package abstractFactory;

public class LuxuryCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType model, Location location) {
		return new LuxuryCar(location);
	}

}