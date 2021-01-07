package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "Lee");
		Customer customerShin = new Customer(10011, "Shin");
		GoldCustomer customerHong = new GoldCustomer(10012, "Hong");
		GoldCustomer customerYul = new GoldCustomer(10013, "Yul");
		VIPCustomer customerKim = new VIPCustomer(10014, "Kim", 12345);


		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);

		System.out.println("++++++Printing Customer+++++");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("++++++Printing Sales Ratio and Bonus Point+++++");
		
		int price  = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price); //overriding 이 되어있기 때문에 자연스럽게 호출이 될것이다.
			System.out.println(customer.getCustomerName() + " paid " + cost + "."); //이것이 다형성 
			System.out.println(customer.showCustomerInfo());
		}
	}
}
