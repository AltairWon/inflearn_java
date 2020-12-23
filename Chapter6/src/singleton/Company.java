package singleton;

public class Company {

	private static Company instance = new Company(); //이 유일하게 사용이 될 instance.
	//값이 바뀌지 않아야 하기 때문에 private으로 선언.
	//단 하나의 instance만 있어야 되면 static을 사용한다.	
	
	private Company(){} //constructor를 private으로 해서 외부에서 함부로 선언을 할 수 없다.
	
	public static Company getInstance() { //객체를 생성하고도 불러야 하기 때문에 객체를 생성하지 않고 사용할려면 static을 사용한다.

		if(instance == null)
			instance = new Company();
		return instance; //이 전체의 클래스를 singlton 패턴이라고 한다.
	}
}
