package Test;

import java.util.ArrayList;
import java.util.Scanner;

interface Totalable {
	void printAVG();
}

class TotalAvg implements Totalable{

	@Override
	public void printAVG() {
		ArrayList<Character> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >>");
		
		for(int i = 0; i < 6; i++) {
			char c = sc.next().charAt(0);
			list.add(c);
		} // ��������� 6�� �Է� �޴°�
		
		// ���⼭ ���Ͱ� �������
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			char c = list.get(i);
			
			switch(c) {
			case 'A':
				sum = sum + 4;
				break;
			case 'B':
				sum = sum + 3;
				break;
			case 'C':
				sum = sum + 2;
				break;
			case 'D':
				sum = sum + 1;
				break;
			case 'F':
				sum = sum + 0;
				break;
			}
		}
		double avr = (double)sum/list.size();
		System.out.println(avr);
		
		sc.close();
	}
	
}

public class GradeAvgTest {

	public static void main(String[] args) {
		Totalable total = new TotalAvg();
		total.printAVG();

	}

}
