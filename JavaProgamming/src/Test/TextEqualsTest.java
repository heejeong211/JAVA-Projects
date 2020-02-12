package Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class TextEqualsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1�� ����: ");
		String src1 = sc.nextLine();

		System.out.print("2�� ����: ");
		String src2 = sc.nextLine();
		boolean equal = false;
		
		try(BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(src1.trim()));
			BufferedInputStream f2 = new BufferedInputStream(new FileInputStream(src2.trim()))) {
			
			int data1, data2;
			if(f1.available() != f2.available()) { // f1.available() ���� ����� �˷��ִ� �Լ�. ������ ���̰� �ٸ���
				equal = false;
				System.out.println("���ϱ��̰� �ٸ��ϴ�.");
			} else  {
				equal = true; // ������ ���̰� ���� �� �� ������ ���ٰ� �����ϰ� while�� ������
				
				while((data1 = f1.read()) != -1) { // data1�� ������ ���� ������ ����
					data2 = f2.read(); // data2�� �޾Ƶ帲
					if(data1 != data2) { // �߰���  �ѱ��ڶ� �ٸ��ٸ�
						equal = false; // �� ������ ���� �ʴ�.
						break; // while�� ����
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();	
		}
		
		if(equal == true)
			System.out.println("������ �����ϴ�.");
		else
			System.out.println("������ ���� �ٸ��ϴ�.");
	}
}
	/*	Scanner sc = new Scanner(System.in);

		System.out.print("1�� ����: ");
		String src1 = sc.nextLine();

		System.out.print("2�� ����: ");
		String src2 = sc.nextLine();

		try (BufferedInputStream in1 = new BufferedInputStream(new FileInputStream(src1.trim()));
			 BufferedInputStream in2 = new BufferedInputStream(new FileInputStream(src2.trim()))) {

			int data1;
			int data2;

			while (((data1 = in1.read()) != -1) && ((data2 = in2.read()) != -1)) {
				
				if (data1 == data2) {
					System.out.println("������ �����ϴ�.");
				} else {
					System.out.println("������ �ٸ��ϴ�.");
						
				}
				break;
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}*/
