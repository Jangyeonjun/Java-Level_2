package _0528;

public class Player {
	String 이름;
	int 체력;
	int 마나;
	int 공격력;
	
	public Player(String 이름, int 체력, int 마나, int 공격력) {
		this.이름 = 이름;
		this.체력 = 체력;
		this.마나 = 마나;
		this.공격력 = 공격력;
	}
	
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get체력() {
		return 체력;
	}
	public void set체력(int 체력) {
		this.체력 = 체력;
	}
	public int get마나() {
		return 마나;
	}
	public void set마나(int 마나) {
		this.마나 = 마나;
	}
	public int get공격력() {
		return 공격력;
	}
	public void set공격력(int 공격력) {
		this.공격력 = 공격력;
	}

	
	void 공격(Monster 적) {
		System.out.printf("%s가 %s를 공격!\n", 이름, 적.이름);
		적.체력 -= 공격력;
	}
	
	void 명상() {
		마나 += 10;
		체력 += 10;
		System.out.printf("%s가 명상! 현재 체력: %d, 마나: %d\n", 이름, 체력, 마나);
	}
	
	void 파이어볼(Monster 적) {
		if(마나 > 30) { 
			System.out.printf("%s가 %s에게 파이어볼 공격! 현재 마나: %d\n", 이름, 적.이름, 마나);
			적.체력 -= 공격력*2;
			마나 -= 30;
		} else {
			System.out.printf("마나 부족(마나:%d)으로 파이어볼 실패..\n", 마나);
		}
		
	}
	
}
