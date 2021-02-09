package retailCompany;

public abstract class Order {
	public abstract Product processOrder(ProductType productType, Channel channel);
}