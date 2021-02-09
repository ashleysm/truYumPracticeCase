package retailCompany;

enum ProductType{
	ELECTRONIC,TOYS,FURNITURE
}

enum Channel{
	WEBSITE,AGENT
}
public abstract class Product {

	ProductType productType =null;
	Channel channel=null;
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public Product(ProductType productType, Channel channel) {
		super();
		this.productType = productType;
		this.channel = channel;
	}
	@Override
	public String toString() {
		return "Product [productType=" + productType + ", channel=" + channel + "]";
	}
	
	abstract void placeOrder();
}