package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("Human drives.");
		System.out.println("Human uses handle");
	}

	@Override
	public void stop() {
		System.out.println("Human uses break");
	}

	@Override
	public void wiper() {
		System.out.println("Human uses wiper.");
	}

}
