package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer(); //abstract class 는 instance화 할 필요가 없다.
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		
		Computer c4 = new MyNoteBook();
		c2.display();
		c4.display();
	}

}
