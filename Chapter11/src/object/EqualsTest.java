package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //equals를 재정의해서 구현할 수도 있다.
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) 
				return true;
			else
				return false;
		}
		return false;
	}
	
	public int hashCode() { //equals에 재정의가 된 변수를 선언하면 된다.
		return studentID;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		/*System.out.println(str1 == str2); //heap memory address가 다르기 때문에 false로 나온다.
		System.out.println(str1.equals(str2));
		*/
		Student std1 = new Student(1001,"Tomas");
		Student std2 = new Student(1001,"Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(str1.hashCode()); //hashCode가 지정이 되어있기 때문에 같은 수로 나온다.
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); //이렇게 하면 다르게 나온다.

	}

}
