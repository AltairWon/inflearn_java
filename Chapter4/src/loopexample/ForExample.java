package loopexample;

public class ForExample {

	public static void main(String[] args) {

		/*int num;
		int sum;
		
		for(num = 1,sum = 0; num <= 10; num ++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);*/
		
		int dan =2;
		int times = 1;
		
		/*for (dan = 2; dan <=9; dan++) {
			
			for (times = 1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println("");
		}*/
		
		while(dan <=9) {
			times = 1;
			while(times <=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println("");
		}
	}

}
