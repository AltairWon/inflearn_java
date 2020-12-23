package staticex;

public class Student {

	private static int serialNum = 10000;//공유값이 필요하기 위해서 사용을 하는 static 변수. 기준값 10000
	//private를 사용을 하면 외부에다가 오픈을 못한다.
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum; //각각 instance가 될 것이다.
	}

	public static int getSerialNum() {
		int i = 10; //local variable 지역변수는 그 메소드 안에서 사용은 가능
		i++;
		System.out.println(i);
		
		//studentName = "Hong"; //member variable or instance variable 멤버변수, 인스턴스 변수
		//static 변수는 멤버변수, 인스턴스 변수를 사용할 수 없다.
		
		return serialNum; //static 변수, 클래스 변수
	}

	/*public static void setSerialNum(int serialNum) { //만약에 유저가 시리얼 넘버를 바꾸고 싶지 않으면 안써도 된다.
		Student.serialNum = serialNum;
	}*/
	
	
}
