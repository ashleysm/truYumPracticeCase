package retailCompany;

public class FurnitureOrder extends Order {

	@Override
	public Product processOrder(ProductType productType, Channel channel) {
		return new Furniture(productType,channel);
	}

}