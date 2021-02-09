package retailCompany;

public class Toys extends Product {

	public Toys(ProductType productType, Channel channel) {
		super(productType, channel);
		this.placeOrder();
	}

	@Override
	void placeOrder() {
		System.out.println("placed Toys order through "+channel);
		
	}

}
