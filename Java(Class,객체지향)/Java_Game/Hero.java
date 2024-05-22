package _0521;

public class Hero {
	// 필드(속성, 변수)
	private String 이름;
	int 공격력;
	private int 체력;
	int 마나;
	
	Hero(){ // 생성자
		이름 = "김호중";
		공격력 = 10;
		체력 = 100;
		마나 = 20;
	}

	Hero(String 이름){ // 생성자 오버로딩
		this.이름 = 이름;
		공격력 = 10;
		체력 = 100;
		마나 = 20;
	}

	Hero(String 이름, int 공격력){ // 생성자 오버로딩
		this.이름 = 이름;
		this.공격력 = 공격력;
		체력 = 100;
		마나 = 20;
	}
	
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get공격력() {
		return 공격력;
	}
	public void set공격력(int 공격력) {
		this.공격력 = 공격력;
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
	
	// 메소드(기능)
	void 공격(Hero h) {
		System.out.printf("%s가 %s를 공격합니다.\n", 이름, h.이름);
		h.체력 -= 공격력;
		System.out.printf("%s의 체력이 %d가 되었습니다.\n", h.이름, h.체력);
	}
	
	void 몸통박치기(Hero h) {
		System.out.printf("%s가 %s에게 몸통박치기 시전!\n", 이름, h.이름);
		h.체력 -= 공격력*2;
		마나 -= 10;
		System.out.printf("%s의 체력이 %d가 되었습니다.\n", h.이름, h.체력);
	}
}











