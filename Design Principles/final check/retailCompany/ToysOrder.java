package retailCompany;

public class ToysOrder extends Order{

	@Override
	public Product processOrder(ProductType productType, Channel channel) {
		return new Toys(productType,channel);
	}

}