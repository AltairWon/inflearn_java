package generics;

import java.util.ArrayList;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>(); //Powder  = generic class
		//사용할 때는 내가 사용할 참조형 타입을 사용한다(클래스 사용)
		printer.setMaterial(new Powder());
		//Powder powder = (Powder)printer.getMaterial(); //downcasting해야 한다 Object -> Powder
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(plastic);
		
		printerPlastic.printing();
		printer.printing();
		
		ArrayList list = new ArrayList();
	}
}
