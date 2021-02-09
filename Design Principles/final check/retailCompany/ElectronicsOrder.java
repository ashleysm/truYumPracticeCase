package retailCompany;

public class ElectronicsOrder extends Order {

	@Override
	public Product processOrder(ProductType productType, Channel channel) {
		return new Electronics( productType, channel );
		
	}

}