package inheritance;

public class VIPCustomer extends Customer { //내가 상위 클래스의 기능을 사용하겠다.

	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
