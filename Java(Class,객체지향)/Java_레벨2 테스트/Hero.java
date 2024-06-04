package _0425;

public class Hero {
	public String get이름() {
		return 이름;
	}

	String 이름;
	int 공격력,체력,방어력;

	Hero(String 이름, int 공격력, int 체력, int 방어력){
		this.이름=이름;
		this.공격력=공격력;
		this.체력=체력;
		this.방어력=방어력;
	}
	
	Hero(String 이름){
		this(이름,20,100,10);	
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

	public int get방어력() {
		return 방어력;
	}

	public void set방어력(int 방어력) {
		this.방어력 = 방어력;
	}

		
	void 공격(Hero 적) {
		System.out.printf("%s이 %s를 공격합니다!!", 이름,적.이름);
		적.체력= 적.체력-(공격력-적.방어력);
	}
	
	void 크리공격(Hero 적) {
		System.out.printf("%s이 %s에게 크리티컬공격합니다!!", 이름,적.이름);
		적.체력= 적.체력-공격력*2;
	}
	
	void 명상() {
		System.out.printf("%s이 명상합니다. 체력을 20", 이름);
			체력+=20;
	}
	

}
