package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		/*Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		*/
		
		Customer customerKim = new VIPCustomer(10111, "Kim"); //이게 가능하다. 업캐스팅
		//하지만 이때는 Customer 클래스의 멤버 변수와 메서드만 사용가능!

		customerKim.bonusPoint = 105;
		
		//System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		//코딩공부는 꺼꿀로 코딩을 하는 방법도 좋다.
	}

}
