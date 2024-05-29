package _0528;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Player p1;
		
		System.out.println("(1)전사 (2)법사");
		int 캐릭터선택 = sc.nextInt();
		if(캐릭터선택 == 1) {
			p1 = new Player("전사", 100, 0, 30);
		} else {
			p1 = new Player("법사", 50, 30, 10);
		}
		
		Monster m1 = new Monster("권세준", 100, 20);		
		System.out.println(m1.get이름()+"을 마주쳤다.");
		
		while(true) {
			System.out.printf("%s 체력: %d, 마나: %d", p1.get이름(), p1.get체력(), p1.get마나());
			System.out.printf("//  %s 체력: %d\n", m1.get이름(), m1.get체력());
			System.out.println("(1)공격, (2)방어, (3)파이어볼");
			int 선택지 = sc.nextInt();
			
			if(선택지 == 1) {
				p1.공격(m1);
			} else if(선택지==2) {
				p1.명상();
			} else {
				p1.파이어볼(m1);
			}
			
			int 몬스터행동 = rd.nextInt(10);
			if(몬스터행동 < 4) {
				m1.공격(p1);
			} else {
				m1.방어();
			}
			
			if(p1.get체력()<=0) {
				System.out.println(p1.get이름()+" Die..");
				break;
			} else if(m1.get체력()<=0) {
				System.out.println(p1.get이름()+"이 "+m1.get이름()+"을 물리쳤습니다.");
				break;
			}
		}
	}
}
