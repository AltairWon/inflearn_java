package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum() );

		
		Student studentJ = new Student();
		System.out.println(studentJ.getSerialNum()); //노란줄이 뜨는 이유는 staic 메소드는 class이름으로 사용을 하기
		//컴파일을 할때는 문제가 되지 않는다.
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		//System.out.println(Student.serialNum);
		//System.out.println(Student.serialNum); //2개의 instance 를 가리키는 값은 같음.
	}
}
