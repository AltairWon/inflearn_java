package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {} //생성자 overload constructor overload
						// default constructor 잘 기억하자
	
	public Student(int id, String name) { //constructor 생성자가 하나도 없는 경우는 support 할 수 있지만
		studentID = id;					//그렇지않으면 support 하지 않는다.
		studentName = name;
		
	}
	
	public void showStudentInfor() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() { // has return value
		return studentName;
	}
	
	public void setStudentName(String name) { //no return value but has void and String name
		studentName = name;
	}
}
