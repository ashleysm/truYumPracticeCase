package abstractFactory;

public class MiniCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType model, Location location) {
		return new MiniCar(location);
	}

}