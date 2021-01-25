package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		/*Calc calc1 = new Calc(); //둘다 추상 클래스이기 때문에 선언할 수 없다.
		Calc calc2 = new Calculator();*/
		
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
