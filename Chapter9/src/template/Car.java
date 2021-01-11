package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {} //구형코드는 없지만 하위 클래스에서 재정의를 하고 싶으면 조정 할 수 있다.
	
	public void startCar() {
		System.out.println("Turn On");
	}
	
	public void turnOff() {
		System.out.println("Turn Off");
	}
	
	public final void run() { //하위 클래스에 재조정을 할 수 있지만 final 을 선언하면 하위 클래스에서 조정할 수 없음.
		startCar(); //변하면 안되는 시나리오면 final을 선언한다.
		drive(); //이것을 template method 라고 한다.
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
