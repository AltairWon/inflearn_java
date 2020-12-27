package array;

public class TowDimensionArrary {

	public static void main(String[] args) {

		int[][] arr = new int[2][3]; //[][] 행/열
		int[][] arr2 = {{1,2,3}, {4,5,6}};
	 	
		/*System.out.println(arr.length); //행의 길이
		System.out.println(arr[0].length); //열의 길이
		System.out.println(arr[1].length);
		System.out.println(" ");
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]); //0,0 ~ 0,2
			}
		}*/
		
		char[][] alphabets = new char[2][6];
		alphabets[0][0] = 'A';
		alphabets[0][1] = 'B';
		alphabets[0][2] = 'C';
		alphabets[0][3] = 'D';
		alphabets[0][4] = 'E';
		alphabets[0][5] = 'F';
		alphabets[1][0] = 'a';
		alphabets[1][1] = 'b';
		alphabets[1][2] = 'c';
		alphabets[1][3] = 'd';
		alphabets[1][4] = 'e';
		alphabets[1][5] = 'f';
		
		for(int i = 0; i<alphabets.length; i++) {
			for(int j = 0; j<alphabets[i].length; j++) {
				System.out.println(alphabets[i][j]);
			}
		}
	}

}
