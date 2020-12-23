package classpart;

public class StudentTest {
	
	public static void main(String[] args) {			
			
		Student studentLee = new Student(100, "Lee Soon Shin"); //생성자가 있는 경우
		studentLee.studentName = "Lee Soon Shin";
		studentLee.studentID = 100;
		studentLee.address = "Seoul";
			
		Student studentKim = new Student(); //생성자가 없는 경우
		studentKim.studentName = "Kim Yoon Shin";
		studentKim.studentID = 101;
		studentKim.address = "Incheon";
			
		studentLee.showStudentInfor();
		studentKim.showStudentInfor(); 
		
		System.out.println(studentLee); //reference value
		System.out.println(studentKim);
	}
}
