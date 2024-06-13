package sw0409;
import java.util.Random;

public class Pmon {
	// 필드
//	private static int 몇마리 = 0;
	private static int 몇마리 = 0;
	String 이름;
	int 체력;
	int 공격력;
	int 스피드;
	Random rd = new Random();
	
	
	int get몇마리(){
		return 몇마리;
	}
	
	Pmon(){
		몇마리++;
		이름 = "포켓몬"+몇마리;
		체력 = rd.nextInt(5, 11)*10;
		공격력 = rd.nextInt(4, 7)*5;
		// 20 25 30
		스피드 = rd.nextInt(1, 21);
	}	
	
	// 메소드
	void 상태창() {
		System.out.printf("이름: %s 체력: %d  공격력: %d  스피드: %d \n",
										이름, 체력, 공격력, 스피드);
	}
	
	void 몸통박치기(Pmon 적){
		System.out.printf("%s 가 %s 을(를) 향해 몸통박치기!!\n",
												이름, 적.이름);
		적.체력 = 적.체력 - 공격력;
	}
	
}
