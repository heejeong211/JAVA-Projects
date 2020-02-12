
public class Method1 {
	
	public static void main(String[] args) {
		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(12, myHeight);
		byEveryone();
	}
	
	public static void hiEveryone(int age, double height) { //매개 변수가 둘인 메소드의 정의
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " +  height + "cm 입니다.");
	}
	
	public static void byEveryone() { //매개 변수가 없는 메소드의 정의
		System.out.println("다음에 뵙겠습니다.");
	}

}
