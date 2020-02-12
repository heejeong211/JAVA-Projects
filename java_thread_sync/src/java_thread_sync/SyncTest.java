package java_thread_sync;

class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 동기화
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 지금 돌아가고 있는 쓰레드를 2초동안 정지시키고, 다른 쓰레드가 돌아감.
		} catch(InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}

//User1
class User1 extends Thread {
	private Calculator calculator;
	
	// Calculator 주입 받음
	public void setCalculator(Calculator calculator) {
		super.setName("CalculatorUser1"); // setName 쓰레드에서(부모로 부터) 가져온거임. 
		this.calculator = calculator;
	}
	
	@Override
	public void run() { // 쓰레드 상속받으면 오버라이딩 표시 해줘야 한다.
		calculator.setMemory(100); // 공유 객체에 100 저장, 대기 값 // 100이 나와야 하는데 50이 나옴. 그 이유는 
	}
}

//User2
class User2 extends Thread {
	private Calculator calculator;
	
	// Calculator 주입 받음
	public void setCalculator(Calculator calculator) {
		super.setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() { // 쓰레드 상속받으면 오버라이딩 표시 해줘야 한다.
		calculator.setMemory(50); // 공유 객체에 50 저장, 대기 값
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
