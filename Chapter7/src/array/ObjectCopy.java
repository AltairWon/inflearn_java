package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("Book1", "Author1");
		bookArray1[1] = new Book("Book2", "Author2");
		bookArray1[2] = new Book("Book3", "Author3");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //기존에 있는 어레이 요소를 카피해서 넣는 방식
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor()); //다른 인스턴스를 가르키는 것을 생각하면 된다.
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		/*for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}*/
		
		bookArray1[0].setBookName("Book4");
		bookArray1[0].setAuthor("Author4");
		
		/*for(int i = 0; i<bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("==============");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //주소가 복사가 되어있다 얇은 복사
		}
		*/
		String[] strArr = {"Java", "Android", "C"};
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for(String s : strArr) { //string 변수 선언 -> 배열을 작성 : 하나한 요소가 s에 들어간다.
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) { //num = arr[i];
			System.out.println(num);
		}
		
	}

}
