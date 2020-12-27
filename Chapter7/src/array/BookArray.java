package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5]; //배열만 생성 한 경우 요소는 null
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("Book1", "Author1");
		library[1] = new Book("Book2", "Author2");
		library[2] = new Book("Book3", "Author3");
		library[3] = new Book("Book4", "Author4");
		library[4] = new Book("Book5", "Author5");
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]); //주소값
		}
		
		for(int i = 0; i<library.length; i++) {
			library[i].showBookInfo(); //출력
		}
	}
}
