package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
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
