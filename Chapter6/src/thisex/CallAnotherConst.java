package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {
		//name = "no name";
		//age = 1;
		
		this("No name", 1); // this 를 생성이 되었기 때문에 사용이 가능하다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}




public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
	}

}
