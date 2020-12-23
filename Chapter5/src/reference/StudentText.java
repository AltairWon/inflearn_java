package reference;

public class StudentText {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorea(100);
		studentJames.setMath(100);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setKorea(70);
		studentTomas.setMath(80);
		
		Student studentBruce = new Student(101, "Tomas");
		studentBruce.setKorea(70);
		studentBruce.setMath(80);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
		studentBruce.showStudentInfo();
		
	}

}
