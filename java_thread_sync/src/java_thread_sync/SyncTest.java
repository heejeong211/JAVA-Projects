package java_thread_sync;

class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// ����ȭ
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // ���� ���ư��� �ִ� �����带 2�ʵ��� ������Ű��, �ٸ� �����尡 ���ư�.
		} catch(InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}

//User1
class User1 extends Thread {
	private Calculator calculator;
	
	// Calculator ���� ����
	public void setCalculator(Calculator calculator) {
		super.setName("CalculatorUser1"); // setName �����忡��(�θ�� ����) �����°���. 
		this.calculator = calculator;
	}
	
	@Override
	public void run() { // ������ ��ӹ����� �������̵� ǥ�� ����� �Ѵ�.
		calculator.setMemory(100); // ���� ��ü�� 100 ����, ��� �� // 100�� ���;� �ϴµ� 50�� ����. �� ������ 
	}
}

//User2
class User2 extends Thread {
	private Calculator calculator;
	
	// Calculator ���� ����
	public void setCalculator(Calculator calculator) {
		super.setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() { // ������ ��ӹ����� �������̵� ǥ�� ����� �Ѵ�.
		calculator.setMemory(50); // ���� ��ü�� 50 ����, ��� ��
	}
}



public class SyncTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
