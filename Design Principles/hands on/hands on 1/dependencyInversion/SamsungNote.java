package dependencyInversion;

public class SamsungNote implements IPhone {

	@Override
	public String GetPhonePart1() {
		return "Display";
	}

	@Override
	public double GetPart1Cost() {
	return 500;
	}

}