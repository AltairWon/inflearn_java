package generics;

public class TreeDPrinter<T extends Material> { //사용할 타입이 대체가 될 곳에다가 T를 넣는다. T는 자료형 매개 변수(type)
	// extends Material 하면 Material을 extends한 클래스만 사용할 수 있다.

	private T material; //어떤 타입으로 오건 Object으로 변형이 된다.

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();		
	}
	
	public void printing() {
		material.doPrinting();
	}
}
