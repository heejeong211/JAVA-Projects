
class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	} // run() 쓰레드의 main()
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
		MyThread1 th1 = new MyThread1(); // 객체생성 해 줘야 함.
		MyThread2 th2 = new MyThread2();
		th1.start(); // run()이 아니고 start()를 사용함.
		th2.start();

	}

}

// run()을 사용하면 싱글쓰레드처럼 결과가 나옴.
// 왜 start()를 사용하는가? 프로그래밍을 OS한테 요청하는 것
// 프로세스에서 쓰레드 전체를 관리하는 친구는 OS이다. 프로세스가 쓰레드를 관리하긴 하지만 프로세스는 OS가 관리함으로 OS가 쓰레드를 관리함.(컨텍스트 스위칭을 OS가 함)
// 메인 안에 또 다른 프로그램이기 때문에 
// 함수 호출은 주소 찾아서 뿌리면 되지만 쓰레드 호출은 OS를 통해서 호출하는 것이기 때문에 조금 까다롭다.
// 결과를 예측할 수 없다.
// 왜 무작위로 나오는가? 중간 중간 마다 컨텍스트 스위칭이 일어나기 때문