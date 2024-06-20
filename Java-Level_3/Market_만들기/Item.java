package market;

public class Item {
	static int 물건명번호;
	int 물건번호 = ++물건명번호;
	private String 물건명;
	private int 가격;
	private int 재고;
	
	public Item(String 물건명, int 가격, int 재고) {
		this.물건명 = 물건명;
		this.가격 = 가격;
		this.재고 = 재고;
	}

	public String get물건명() {
		return 물건명;
	}
	
	public void set물건명(String 물건명) {
		this.물건명 = 물건명;
	}

	public int get가격() {
		return 가격;
	}

	public void set가격(int 가격) {
		this.가격 = 가격;
	}

	public int get재고() {
		return 재고;
	}

	public void set재고(int 재고) {
		this.재고 = 재고;
	}

	void 정보출력() {
		System.out.println("물건번호: "+물건번호);
		System.out.println("물건명: "+물건명);
		System.out.println("가격: "+가격+" 원");
		System.out.println("재고: "+재고+" 개");
	}
}
