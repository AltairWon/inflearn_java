package reference;

public class Student {

	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math; //자료형
	
	
	
	public Student() {
		korea = new Subject("Korean");;
		math = new Subject("Math");
	}
	
	public Student(int id, String name) {
		studentID= id;
		studentName = name;
		
		korea = new Subject("Korean");
		math = new Subject("Math");
	}
	
	public void setKorea(int score) {
		//korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(int score) {
		//math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " Total Score is " + total);
	}
	
}
