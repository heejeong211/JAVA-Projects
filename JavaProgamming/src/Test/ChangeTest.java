package Test;

import java.util.Scanner;

class Change implements IProblem{
	

	@Override
	public void changeDallarToKorea() {
		
		int won = 0;
		
		Scanner sc = new Scanner(System.in);
		
		won = sc.nextInt();
		
		double dallar = won/1100;
		
		System.out.print("��ȭ�� �Է��ϼ���.(���� ��)>>");
		System.out.println(won + "���� $" + dallar + "�Դϴ�.");
		
		
	}
	
}

public class ChangeTest {

	public static void main(String[] args) {
		

	}

}
