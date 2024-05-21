package sw0409;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 몇개?");
		int 배열크기 = sc.nextInt();
		
		String 연산자;
		while(true) {
			System.out.print("연산자를 선택하세요 +, -, *");
			연산자 = sc.next();
			if(연산자.equals("+") || 연산자.equals("-") || 연산자.equals("*"))
				break;
		}
		
		Calc c = new Calc(배열크기, 연산자);
		
		int[] 배열 = new int[배열크기];
		for(int i=0; i<배열.length; i++) {
			System.out.printf("배열[%d]: ", i);
			배열[i] = sc.nextInt();
		}
		
		c.set배열(배열);

		System.out.println(c.연산작업());
		
	}

}
