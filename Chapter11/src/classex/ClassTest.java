package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		/*Person person = new Person();
		
		Class pClass = person.getClass(); //getClass() = 인스턴스를 한 클래스가 있으면 getClass로 사용해서 Class clss를 가져올 수 있다.
		
		System.out.println(pClass.getName());
		
		Class pClass2 = Person.class; //class로 사용해서 가져올 수 있다.
		System.out.println(pClass.getName());
*/
		Class pClass3 = Class.forName("java.lang.String"); //forName을 사용해서 할 수 있다.
		System.out.println(pClass3.getName());
		
		Person p = new Person();
		
		Class pClass = Class.forName("classex.Person"); //종종 쓸일이 있다.
		
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p);
		System.out.println(p2);
		
	}

}
