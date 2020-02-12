package Test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

interface IRandomNum {
	void correctNum();
}

class RandomGame implements IRandomNum {
	@Override
	public void correctNum() {
		int answer = (int)(Math.random() * 100) +1;
		System.out.println("컴퓨터가 정한 숫자: " + answer); 
		
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("======= 자... 게임을 시작하지.... =======");
			System.out.print("1부터 100까지의 값을 입력하세요: ");
			Scanner sc = new Scanner(System.in);
			try {
			     input = sc.nextInt();
			} catch (InputMismatchException e) {
				//e.printStackTrace();
				System.out.print("유효하지 않는 값입니다. 다시 넣으세요. ");
				continue;
			}
			
			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("축하축하 맞추었습니닷!!!");
				System.out.println("시도 횟수는 " + count + "번 " + "입니다.");
				break;
			}
			
		}while(true);
		
	}

}

public class RandomGameTest {

	public static void main(String[] args) {
		IRandomNum rg = new RandomGame();
		rg.correctNum();

	}

}
