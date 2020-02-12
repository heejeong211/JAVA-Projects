package Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class TextEqualsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1번 파일: ");
		String src1 = sc.nextLine();

		System.out.print("2번 파일: ");
		String src2 = sc.nextLine();
		boolean equal = false;
		
		try(BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(src1.trim()));
			BufferedInputStream f2 = new BufferedInputStream(new FileInputStream(src2.trim()))) {
			
			int data1, data2;
			if(f1.available() != f2.available()) { // f1.available() 파일 사이즈를 알려주는 함수. 파일의 길이가 다르면
				equal = false;
				System.out.println("파일길이가 다릅니다.");
			} else  {
				equal = true; // 파일의 길이가 같을 때 두 파일이 같다고 가정하고 while를 돌리면
				
				while((data1 = f1.read()) != -1) { // data1가 파일의 끝을 만날때 까지
					data2 = f2.read(); // data2를 받아드림
					if(data1 != data2) { // 중간에  한글자라도 다르다면
						equal = false; // 두 파일은 같지 않다.
						break; // while문 멈춤
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();	
		}
		
		if(equal == true)
			System.out.println("파일이 같습니다.");
		else
			System.out.println("파일이 서로 다릅니다.");
	}
}
	/*	Scanner sc = new Scanner(System.in);

		System.out.print("1번 파일: ");
		String src1 = sc.nextLine();

		System.out.print("2번 파일: ");
		String src2 = sc.nextLine();

		try (BufferedInputStream in1 = new BufferedInputStream(new FileInputStream(src1.trim()));
			 BufferedInputStream in2 = new BufferedInputStream(new FileInputStream(src2.trim()))) {

			int data1;
			int data2;

			while (((data1 = in1.read()) != -1) && ((data2 = in2.read()) != -1)) {
				
				if (data1 == data2) {
					System.out.println("파일이 같습니다.");
				} else {
					System.out.println("파일이 다릅니다.");
						
				}
				break;
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}*/
