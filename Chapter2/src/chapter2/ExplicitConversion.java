package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte)iNum; //set byte 
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum; //set int
		System.out.println(iNum);
		float fNum = 0.9f;
		
		int num1 = (int)dNum + (int)fNum; // int dNum = 3 int fNum = 0
		int num2 = (int)(dNum + fNum); // (dNum = 3.14 + fNum = 0.9) = 4.04 
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
