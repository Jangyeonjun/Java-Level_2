package market;

public class MarketMain {

	public static void main(String[] args) {
		Market 마켓 = new Market("성일마켓");
		
		System.out.println(마켓);
		System.out.println(마켓.마켓이름);
		System.out.println(마켓.물건[0].get물건명());
		System.out.println(Item.물건명번호);
		마켓.재고현황();
		
		
		
		
	}

}
