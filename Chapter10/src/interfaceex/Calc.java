package interfaceex;

public interface Calc { //interface = 모든 메소드가 추상 클래스로 이루어진 클래스
	
	double PI = 3.14; //상수로 선언이 된다. public static final PI
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
