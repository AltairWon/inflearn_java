package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) { // 여기의 year는 지역변수
		this.year = year; //이름이 같을 변수명이면 this.year로 선언을 하는 것이 좋다.
						  //this = 자기 자신의 메모리를 가리킴. 생성된 메모리의 주소를 가리킴.
	}
	
	public void printThis() {
		System.out.println(this); // this = 현재 instance 한 주소값
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();
	}

}
