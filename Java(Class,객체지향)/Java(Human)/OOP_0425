package sw0409;

public class OOP_0425 {

	public static void main(String[] args) {
		String 이름 = "정연택";
		
		String 선생님 = new String("정연택");
		
		System.out.println(이름==선생님);
		
		String 주민번호 = "8912071046218";
		int 성별 = Character.getNumericValue(주민번호.charAt(6));
		System.out.println(성별);
		
		switch (성별) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;			
		}
		
		String 변수 = "정,연,택";
		String[] 배열 = 변수.split(",");
		
		System.out.println(배열);
		// for(int i=0; i<배열.length; i++) {
			// System.out.println(배열[i]);
		// }
		
		for(String i: 배열) {
			System.out.println(i);
		}
		
		Human h1 = new Human();
		h1.자기소개();
		
		h1.키 = 168;
		h1.몸무게 = 72;
		h1.이름 = "정연택";

		h1.자기소개();
		
	}
}
