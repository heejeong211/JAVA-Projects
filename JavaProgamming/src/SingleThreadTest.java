
public class SingleThreadTest {

	public static void main(String[] args) {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
		
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}

	} // main

}
// 하나의 프로그램에 서로 다른 작업.. -> 동시에 진행 안됨... 코드는 위에서 아래로 읽으니까 
// 동시에 진행하고 싶으면 쓰레드를 사용해야 함.