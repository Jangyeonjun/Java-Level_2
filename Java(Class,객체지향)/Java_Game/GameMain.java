package _0521;

public class GameMain {

	public static void main(String[] args) {
		Hero h1;
		// Hero 인스턴스를 가르키는 h1이라는 참조변수를 생성한다.
		h1 = new Hero();
		// h1에 Hero 생성자로 만들어낸 인스턴스의 주소를 저장한다.
		System.out.println("영웅 이름: "+h1.get이름());
		System.out.println("영웅 공격력: "+h1.get공격력());
		System.out.println("영웅 체력: "+h1.get체력());
		System.out.println("영웅 마나: "+h1.get마나());

		Hero h2 = new Hero("곽권", 99);

		h1.공격(h2);
		h1.몸통박치기(h2);
		h2.몸통박치기(h1);
		
		
		
		
//		h1.이름 = "정연택";
//		h1.set이름("정연택");
		
//		System.out.println(h1.이름);
//		System.out.println(h1.get이름());
// 		get - 얻다. 가져오다.  set - 놓다. 정하다.
		
	}

}
