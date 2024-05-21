package sw0409;

public class Monster {
	String name = "발록";
	int hp = 120;
	int atk = 30;
	boolean die = false;
	
	int 공격() {
		System.out.println(name+"이 공격합니다! 키야아악~!");
		return atk;
	}

	void 공격당함(int 데미지) {
		hp = hp - 데미지;
		
		if(hp<=0) {
			die = true;
			System.out.println(name+"을 처치했습니다.");
		}
	}
}
