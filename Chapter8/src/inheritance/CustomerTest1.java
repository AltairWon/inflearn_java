package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10111);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 5;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
