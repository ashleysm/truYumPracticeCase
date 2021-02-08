package dependencyInversion;

public class Main {

	public static void main(String[] args) {
		Redmi7 redmi=new Redmi7();
		SamsungNote samsung= new SamsungNote();
		ProcessPhoneRepair phones=new ProcessPhoneRepair();
		phones.repairSteps(samsung);
		phones.repairSteps(redmi);

	}

}