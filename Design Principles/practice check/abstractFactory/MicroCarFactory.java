package abstractFactory;

public class MicroCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType model, Location location) {
		return new MicroCar(location);
	}

}