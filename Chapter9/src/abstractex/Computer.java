package abstractex;

public abstract class Computer {

	public abstract void display(); //구형 코드가 없으니 추상 클래스가 된다. 선언만 한다.
	public abstract void typing();
		
	public void turnOn() {
		System.out.println("Turn On.");
	}
	
	public void turnOff() {
		System.out.println("Turn Off.");
	}
}
