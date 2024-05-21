package sw0409;

public class Hero {
	String name = "정연택";
	int hp = 80;
	int atk = 10;
	boolean die = false;
	
	int 공격() {
		System.out.println(name+"이 공격합니다! 얍~!");
		return atk;
	}
	
	void 공격당함(int 데미지) {
		hp = hp - 데미지;
		
		if(hp<=0) {
			die = true;
			System.out.println(name+"이 죽었습니다..");
		}
	}
}
