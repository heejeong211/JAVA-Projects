import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초 간격으로 찍어라. 1000이 밀리세컨즈 지금 실행중인 프로그래밍을 1초 쉬어라. 1초 뒤에 다시 시작하라. 내꺼는 1초 동안 쉬고 그 동안에 다른 프로그램을 컨텍스트 스위칭을 해라(다른 프로그램이 CPU를 써라)
			}
			catch(Exception e) {
				
			}
		}
	}

}

// 모달리스크 
// 입력창이 뜨고 나서 아무것도 안눌르면 밑에께 실행이 안됨.
// 쓰레드로 만들면 입력창을 안기다려도 된다.