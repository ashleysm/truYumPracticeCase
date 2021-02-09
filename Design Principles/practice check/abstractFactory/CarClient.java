package abstractFactory;

public class CarClient {

	public static void main(String[] args) {
		MiniCarFactory mini= new MiniCarFactory();
		MicroCarFactory micro= new MicroCarFactory();
		LuxuryCarFactory luxury= new LuxuryCarFactory();
		
		System.out.println(micro.buildCar(CarType.MICRO, Location.USA));
		System.out.println(mini.buildCar(CarType.MINI, Location.INDIA));
		System.out.println(luxury.buildCar(CarType.LUXURY, Location.DEFAULT));
	}
}