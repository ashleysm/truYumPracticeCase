package retailCompany;

public class Electronics extends Product{

	public Electronics(ProductType productType, Channel channel) {
		super(productType, channel);
		this.placeOrder();
	}

	@Override
	void placeOrder() {
		System.out.println("placed Electronics order through "+channel);		
	}

}
