package sw0409;

public class PmonMain {

	public static void main(String[] args) {
		Qmon 연준 = new Qmon();
		Pmon 곽권 = new Pmon();
		
		연준.상태창();
		곽권.상태창();		
		
		곽권.몸통박치기(연준);
		
		연준.상태창();
		곽권.상태창();
		
		연준.몸통박치기(곽권);

		연준.상태창();
		곽권.상태창();
	}
}
