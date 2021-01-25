package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer; //customer 는 Buy의 interface를 implement 했기 때문에 가능.
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		
		customer.order();
		buyer.order(); //가상 메소드
		seller.order(); //자바는 가상 메소드방식이라서 지금 선언한 customer의 오버라이딩 된 order가 나온다.
	}
}
