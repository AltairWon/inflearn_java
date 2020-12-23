package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		
		Company c2 = Company.getInstance();
		
		Company c3 = new Company(); //error가 나오
		
		System.out.println(c1 = c2); //true가 나오게 해라. 문제 예
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
