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
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

	}

}

// ���α׷��� ���� ������. ������ ���� ���� �� �Է�â�� �Է��� �� ������ ��ٷ� ��ٸ� ������ ��ٸ��� ����.
// ������ ���������� ������.
// ��Ƽ�����带 ������ �ð��� �پ���.