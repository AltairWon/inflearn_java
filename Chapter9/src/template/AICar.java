package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차자 스스로 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크로 정지합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("AI indicates to use wiper.");		
	}

	@Override
	public void washCar() {
		System.out.println("자동으로 세차가 됩니다.");
	}
	
	

}
