package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {
		//name = "no name";
		//age = 1;
		
		//int i = 0; // this를 선언한 메소드 안에다가는 어떤것도 생성이 불가능하다.
		
		this("No name", 1); // this 를 생성이 되었기 때문에 사용이 가능하다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { //자기 자신의 class명으로.
		return this; //현재 instance 한 주소값이 된다. 
	}
	
}




public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); //주소값이 출력이 된 것을 볼 수 있다.
	}

}
