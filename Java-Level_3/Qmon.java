package sw0409;
import java.util.Random;

public class Qmon extends Pmon{
	String 속성;
	Random rd = new Random();
	
	Qmon(){	
		super();
		System.out.println("메가진화!");
		this.공격력 = 공격력*2;
		
//		속성 부여(물불풀)
		int 초기속성 = rd.nextInt(3);
		if(초기속성==0) {
			속성 = "풀";
		} else if(초기속성==1) {
			속성 = "불";
		} else {
			속성 = "물";
		}
	}
	
	@Override
	void 상태창() {
		System.out.printf("이름: %s 체력: %d  "
						+"공격력: %d  스피드: %d  속성: %s\n",
								이름, 체력, 공격력, 스피드, 속성);
	}

	void 몸통박치기(Pmon 적){
		System.out.printf("%s 가 %s 을(를) 향해 %s의 몸통박치기!!\n",
												이름, 적.이름, 속성);
		적.체력 = 적.체력 - (공격력+20);
	}
	
	void 몸통박치기(Qmon 적){
		if((속성=="풀" && 적.속성=="물")
			|| (속성=="물" && 적.속성=="불")
			|| (속성=="불" && 적.속성=="풀")) {
			// 풀-물, 물-불, 불-풀
			System.out.printf("%s 가 %s 을(를) 향해 %s의 몸통박치기!!\n",
					이름, 적.이름, 속성);
			System.out.println("효과는 굉장했다!");
			적.체력 = 적.체력 - (공격력+40);			
		} else {
			// 풀-풀, 물-물, 불-불, 풀-불, 물-풀, 불-물
				System.out.printf("%s 가 %s 을(를) 향해 %s의 몸통박치기!!\n",
						이름, 적.이름, 속성);
				적.체력 = 적.체력 - (공격력+20);
		}
	}
	
	
}
