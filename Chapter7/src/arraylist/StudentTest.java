package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("Korean", 100);
		studentLee.addSubject("English", 90);

		studentLee.showStudentInfo();
		
		System.out.println("===============");
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("Korean", 100);
		studentKim.addSubject("English", 90);
		studentKim.addSubject("Math", 80);

		studentKim.showStudentInfo();
	}

}
