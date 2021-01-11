package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("겁나게 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("겁나게 높이 jump 한다.");

	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돈다");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====고급자 레벨입니다.=====");
	}

}
