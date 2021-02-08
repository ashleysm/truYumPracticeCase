package phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to our site. Would you like to order or repair?");
		Scanner sc=new Scanner(System.in);
		String option=sc.nextLine().toLowerCase();
		String productDetail="";
		PhoneRepair phoneRepair=new PhoneRepair();
		PhoneOrder phoneOrder=new PhoneOrder();
		switch(option) {
		case "order":
			System.out.println("Please provide the phone model name:");
			productDetail = sc.nextLine();
			System.out.println(phoneOrder.ProcessOrder(productDetail));
			break;
			
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType=sc.nextLine();
			if(productType.equalsIgnoreCase("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail=sc.nextLine();
				System.out.println(phoneRepair.ProcessPhoneRepair(productDetail));
				}
			else
			{
				System.out.println("Please provide the accessory details, like headphone, tempered glass");
				productDetail=sc.nextLine();
				System.out.println(phoneRepair.ProcessAccessoryRepair(productDetail));
			}
			break;
		default:
			break;
		}
		sc.close();
	}

}