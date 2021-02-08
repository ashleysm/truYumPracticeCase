package phone;

public class PhoneRepair implements IRepair {

	@Override
	public String ProcessPhoneRepair(String modelName) {
		String msg=modelName+" repair accepted!";
		return msg;
	}

	@Override
	public String ProcessAccessoryRepair(String accessoryName) {
		String msg=accessoryName+" repair accepted!";
		return msg;
		
	}

}