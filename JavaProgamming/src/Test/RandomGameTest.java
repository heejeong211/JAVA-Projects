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
		System.out.println("��ǻ�Ͱ� ���� ����: " + answer); 
		
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("======= ��... ������ ��������.... =======");
			System.out.print("1���� 100������ ���� �Է��ϼ���: ");
			Scanner sc = new Scanner(System.in);
			try {
			     input = sc.nextInt();
			} catch (InputMismatchException e) {
				//e.printStackTrace();
				System.out.print("��ȿ���� �ʴ� ���Դϴ�. �ٽ� ��������. ");
				continue;
			}
			
			if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else {
				System.out.println("�������� ���߾����ϴ�!!!");
				System.out.println("�õ� Ƚ���� " + count + "�� " + "�Դϴ�.");
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
