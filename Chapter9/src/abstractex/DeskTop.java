package abstractex;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
	/*public void turnOn() { //필요하면 제정의 할 수 있다. 이것이 overriding.
		System.out.println("DeskTop turnOn()");
	}*/

}
