package Test;

import java.util.Scanner;
import java.util.Vector;

public class PrecipitationTest {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>(); // LinkedList<>, ArrayList<>�� �ص� ��.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >>");
			int rain = sc.nextInt();
			
			if(rain == 0) {
				break;
			}
			vec.add(rain);
			
			int avg = 0;
			
			for(int i = 0; i < vec.size(); i++) {
				System.out.print(vec.get(i) + " ");
				avg = avg + vec.get(i); // �ȿ� �ִ� ���� ���ϴ� ��
			}
			
			System.out.println();
			avg = avg/vec.size();
			
			System.out.println("���� ���" + avg);
		}
		System.out.println("���α׷� �����Դϴ�.");
		sc.close();
	}
}
		
		/*
		
		Vector<Integer> vec = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է� (0 �Է½� ����) >> ");
			int rain = sc.nextInt();
			for(int i = 0; i < vec.size(); i++) {
				System.out.println(vec.elementAt(i));
			}
			int sum = 0;
			int avg = sum/rain;
			System.out.println("���� ��� " + avg);
			
			if(rain == 0) {
				break;
			}
		}

	}

}
*/