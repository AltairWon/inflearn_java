package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		/*Customer customerLee = new Customer(10010, "Lee");
		int price = customerLee.calcPrice(10000);
		System.out.println("Price is " + price + ". " + customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10011, "Kim",100);
		price  = customerKim.calcPrice(10000);
		System.out.println("Price is " + price + ". " + customerKim.showCustomerInfo());*/
		
		Customer customerWho = new VIPCustomer(10011, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("Price is " + price + ". " + customerWho.showCustomerInfo());
		
		//가상함수(virtual method) = 제정이가 된 메소드가 호출이 된다 instance 된 메소드가 호출이 된다.
		
		Customer customerGold = new GoldCustomer(10012, "Gold");
		price = customerGold.calcPrice(10000);
		System.out.println("Price is " + price + ". " + customerGold.showCustomerInfo());
	}

}
