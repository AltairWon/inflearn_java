package inheritance;

public class VIPCustomer extends Customer { //내가 상위 클래스의 기능을 사용하겠다.

	int agentID;
	private double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID,customerName);
		//super(); //상위 클래스를 가리키는 참조자. 생성자를 호출하는데 default constructor를 호출한다.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		//System.out.println("VIPCustomer(int, String) 호출");

	}
	
	public int calcPrice(int price) { //override - 덮어씌우다.
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
