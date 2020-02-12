
class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	} // run() �������� main()
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
	} // run
}

public class MultiThreadTest {

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1(); // ��ü���� �� ��� ��.
		MyThread2 th2 = new MyThread2();
		th1.start(); // run()�� �ƴϰ� start()�� �����.
		th2.start();

	}

}

// run()�� ����ϸ� �̱۾�����ó�� ����� ����.
// �� start()�� ����ϴ°�? ���α׷����� OS���� ��û�ϴ� ��
// ���μ������� ������ ��ü�� �����ϴ� ģ���� OS�̴�. ���μ����� �����带 �����ϱ� ������ ���μ����� OS�� ���������� OS�� �����带 ������.(���ؽ�Ʈ ����Ī�� OS�� ��)
// ���� �ȿ� �� �ٸ� ���α׷��̱� ������ 
// �Լ� ȣ���� �ּ� ã�Ƽ� �Ѹ��� ������ ������ ȣ���� OS�� ���ؼ� ȣ���ϴ� ���̱� ������ ���� ��ٷӴ�.
// ����� ������ �� ����.
// �� �������� �����°�? �߰� �߰� ���� ���ؽ�Ʈ ����Ī�� �Ͼ�� ����