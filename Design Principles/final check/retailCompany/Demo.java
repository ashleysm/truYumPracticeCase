package retailCompany;

public class Demo {

	public static void main(String[] args) {
		ElectronicsOrder electronincs= new ElectronicsOrder();
		FurnitureOrder furniture= new FurnitureOrder();
		ToysOrder toys= new ToysOrder();
		
		System.out.println(electronincs.processOrder(ProductType.ELECTRONIC,Channel.AGENT));
		System.out.println(furniture.processOrder(ProductType.FURNITURE,Channel.WEBSITE));
		System.out.println(toys.processOrder(ProductType.TOYS,Channel.AGENT));
	}

}
