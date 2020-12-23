package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2); // call the method in num1 and num2
		System.out.println(sum);
		
	}
	
	public static int addNum(int n1, int n2) { //method
		int result = n1 + n2;
		return result; //return if there is no return value, put 'void' instead of 'int' in static
	}
}
