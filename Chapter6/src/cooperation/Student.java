package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //Bus는 객체
		bus.take(1000); //객체의 협업 cooperation of object
		money -= 1000;
	}
	public void takeSubway(Subway subway) { //Bus는 객체
		subway.take(1500); //객체의 협업 cooperation of object
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "has " + money + " left.");
	}
}
