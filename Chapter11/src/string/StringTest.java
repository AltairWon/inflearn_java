package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2); //새로운 address로 생성이 된다. 새로 생성된 문자열을 가리킴
		//문자열 연결을 계속하면 메모리에 garbage 가 많이 생길 수 있음.
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		/*String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); //이렇게 string 으로 선언을 하면 가능
		*/
		
	}

}
