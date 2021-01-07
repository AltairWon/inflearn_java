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
	
	public void readBook() {
		System.out.println("Human can read.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("Tiger is moving");
	}
	
	public void hunting() {
		System.out.println("Tiger can hunt.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("Eagle is moving");
	}
	
	public void flying() {
		System.out.println("Eagle can fly.");
	}
}


public class AnimalText {

	public static void main(String[] args) {
		AnimalText test = new AnimalText();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		
	}
	
	public void moveAnimal(Animal animal) { //Animal = 상위클래스
		animal.move(); //재정의가 된 메소드가 호출됨.
		
		/*Human human = (Human)animal; //complie은 되지만 다음 메소드가 안된다.
		human.readBook();*/
		
		if(animal instanceof Human) { //downcast를 하기 위해서는 if문을 생성하고 instanceof를 사용해서 하위 클래스에서 사용하고 싶은 메소드를 호출한다.
			//instanceof는 인스턴스의 타입을 체크하는 예약어이다.
			//Object로 변환이 될 수 있는 경우가 생길때 사용이 된다. 반환값이 Object일때.
			Human human = (Human)animal;
			human.readBook(); //상속관계에서 해결이 가능하면 overriding을 사용! 만약에 overriding이 안되면 instanceof로 사용.
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("System Error.");
		}
	}

}
