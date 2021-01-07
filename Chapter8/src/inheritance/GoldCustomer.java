package inheritance;

public class GoldCustomer extends Customer{

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		bonusRatio = 0.06;
		
	}

	@Override //complier 에게 이 메소드가 어떤 일을 할 것이다 라는 것을 알려준다.
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}

	
}
