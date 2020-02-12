package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AlphabetUpperTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ����: ");
		String src = sc.nextLine();
		System.out.print("�纻 ����: ");
		String dst = sc.nextLine();
		
		try(BufferedReader in = new BufferedReader(new FileReader(src));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst))){
			
			int data;
			while((data = in.read()) != -1) {
				if(data >= 97 && data <= 122) { // �ƽ�Ű�ڵ� �ҹ��� ����
					out.write((char)(data-32)); // ���� ���ڸ� ���� ��� ��Ʈ���� ��. // 32�� �ƽ�Ű�ڵ忡�� �빮�ڿ� �ҹ����� ��ȣ ����
					System.out.print((char)(data-32));
				} else {
					out.write(data);
					System.out.print((char)(data));
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
// toUpperCase() �ᵵ �Ǵµ�, ���� ���Ͽ� Ư�����ڰ� ������ �Ƹ� ����� �޾Ƴ��� ������ ���̴�.

/*
 * try(BufferedReader br = new BufferedReader(new FileReader("alphabet.txt"))) {
 * String str;
 * 
 * while(true) { 
 * str = br.readLine();
 * if(str == null) break;
 * System.out.print(str.toUpperCase()); // �ҹ��ڸ� �빮�ڷ� �ٲ��ִ� �Լ� .toUpperCase()
 *  }
 * }
 * catch(IOException e) { e.printStackTrace(); 
 *   }
 *  }
 * }
 */
