package retailCompany;

public class Furniture extends Product{

	public Furniture(ProductType productType, Channel channel) {
		super(productType, channel);
		this.placeOrder();
	}

	@Override
	void placeOrder() {
		
		System.out.println("placed Furniture order through "+channel);
	}

}
