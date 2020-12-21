package ifexample;

public class IfExample3 {

	public static void main(String[] args) {
		
		int age = 9;
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("You are kindergarden");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("You are Elementry Student");
		}
		if (age < 20) {
			charge = 2500;
			System.out.println("You are teenager");
		}
		else {
			charge = 3000;
			System.out.println("You are adult");
		}
		
		System.out.println("The fee is " + charge + " won.");
	}

}
