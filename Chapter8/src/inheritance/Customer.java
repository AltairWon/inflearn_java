package inheritance;

public class Customer {

	
	protected int customerID; //protected = 외부 클래스는 private이지만 상속받는 클래스는 public처럼 사용가능한 키워드
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio; //포인트 비율	
	
	/*public Customer() { //처음 고객의 등급
		
		super(); //Object 라는 모든 자바 클래스의 최상위 클래스한테 상속을 받았다.
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 호출"); //하위 클래스가 생성이 될 때는 항상 상위 클래스가 먼저 생성이 된다.
	}*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		//System.out.println("Customer(int, String) 호출");
	}
	
	public int calcPrice(int price) {
		if(customerGrade =="SILVER") {
			bonusPoint += price * bonusRatio;
		}
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "'s grade is " + customerGrade + " and, bonus point is " + bonusPoint; 
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
