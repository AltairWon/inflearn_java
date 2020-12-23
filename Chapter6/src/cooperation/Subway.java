package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {  //constructor
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("Subway " + lineNumber + " has " + passengerCount + "passengers and income is " + money);
	}
}
