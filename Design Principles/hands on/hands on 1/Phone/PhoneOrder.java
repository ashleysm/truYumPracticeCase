package phone;

public class PhoneOrder implements IOrder{

	@Override
	public String ProcessOrder(String modelName) {
		String msg=modelName+" order accepted!";
		return msg;
	}

}