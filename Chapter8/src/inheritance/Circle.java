package inheritance;

public class Circle {

	private int x;
	private int y;
	
	Point point; //상속은 만들어진 클래스에서 사용을 하고 더 구체적인 클래스로 사용을 한다면 사용을 하지만 그 외에 그냥 사용을 할 것이면 상속의 의미는 아니다.
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
}
