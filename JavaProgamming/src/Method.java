
public class Method {
	
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		
		hiEveryone(12); //함수 쓰는 법, 함수의 호출
		hiEveryone(13);
		System.out.println("프로그램의 끝");
	
	}
	//fuction(기능) = 함수 = method
	public static void hiEveryone(int age) { //함수 만드는 법 
		System.out.println("좋은 아침 입니다."); //출력을 담당하는 기능을 만드는 함수.
		System.out.println("제 나이는 " + age + "세 입니다.");
	}

}

//한번 함수를 호출하면 그 값은 버리고
//새로운 방을 만든다.
//함수 안에 함수 못집어넣음.