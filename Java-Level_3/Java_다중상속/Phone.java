package _0613;

public class Phone {
	public String 모델;
	public String 색상;
	
	Phone(String 모델, String 색상){
		System.out.println("Phone() 생성자 실행");
		this.모델 = 모델;
		this.색상 = 색상;
	}
	
	public void 종() {
		System.out.println("벨이 울립니다.");
	}
	
	public void 음성보내기(String 메세지) {
		System.out.println("자기: "+메세지);
	}
	
	public void 음성받기(String 메세지) {
		System.out.println("상대방: "+메세지);
	}
	
	public void 끊기() {
		System.out.println("전화를 끊습니다.");
	}
}
