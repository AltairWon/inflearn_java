package inheritance;

class Animal{
	public void move() {
		System.out.println("Animal is moving.");
	}
}

class Human extends Animal{ //다형성(Polymorphism) - 하나의 코드가 여러가지 자료형으로 구현어서 실행이 되는 것.
							//동일한 상위클래스가 있으면 서로 다른 메소드를 재정의 한다.
	public void move() {
		System.out.println("Human is moving");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("Tiger is moving");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("Eagle is moving");
	}
}


public class AnimalText {

	public static void main(String[] args) {
		AnimalText test = new AnimalText();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

		//Animal animal = new Human(); //same as Human()
	}
	
	public void moveAnimal(Animal animal) { //Animal = 상위클래스
		animal.move(); //재정의가 된 메소드가 호출됨.
	}

}
