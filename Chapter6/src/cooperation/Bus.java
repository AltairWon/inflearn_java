package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {  //constructor
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("Bus " + busNumber + " has " + passengerCount + "passengers and income is " + money);
	}
}
