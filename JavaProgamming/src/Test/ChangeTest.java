package Test;

import java.util.Scanner;

class Change implements IProblem{
	

	@Override
	public void changeDallarToKorea() {
		
		int won = 0;
		
		Scanner sc = new Scanner(System.in);
		
		won = sc.nextInt();
		
		double dallar = won/1100;
		
		System.out.print("원화를 입력하세요.(단위 원)>>");
		System.out.println(won + "원은 $" + dallar + "입니다.");
		
		
	}
	
}

public class ChangeTest {

	public static void main(String[] args) {
		

	}

}
