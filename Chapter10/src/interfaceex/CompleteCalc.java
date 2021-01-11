package interfaceex;

public class CompleteCalc extends Calculator { //구현 상속 

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if( num2 != 0) {
			return num1 / num2;
		}
		return ERROR; //상속 받아서 사용이 가능
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
