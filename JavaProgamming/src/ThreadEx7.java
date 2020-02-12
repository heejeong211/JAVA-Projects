import javax.swing.JOptionPane;

class ThreadEx7_1 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}

public class ThreadEx7 {

	public static void main(String[] args) {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");

	}

}

// 프로그램이 따로 움직임. 전꺼는 숫자 세는 걸 입력창에 입력을 할 때까지 기다려 줬다면 지금은 기다리지 않음.
// 완전히 독립적으로 움직임.
// 멀티쓰레드를 돌리면 시간이 줄어든다.