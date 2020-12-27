package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[] {0, 1, 2}; // array
		int[] numbers2 = new int[3]; // another example
		
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		
		for (int i = 0; i<3; i++) { //이렇게도 사용을 한다 i<3
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i<numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
		int[] numbers3;
		
		numbers3 = new int[] {1,2,3};
		
		System.out.println(numbers.length);
		
		
		int[] studentIDs = new int[5]; //초기화는 0부터 시작한다
		
		for (int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
		
	}

}
