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
		System.out.print("대상 파일: ");
		String src = sc.nextLine();
		System.out.print("사본 파일: ");
		String dst = sc.nextLine();
		
		try(BufferedReader in = new BufferedReader(new FileReader(src));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst))){
			
			int data;
			while((data = in.read()) != -1) {
				if(data >= 97 && data <= 122) { // 아스키코드 소문자 범위
					out.write((char)(data-32)); // 읽은 문자를 버퍼 출력 스트림에 씀. // 32는 아스키코드에서 대문자와 소문자의 번호 차이
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
// toUpperCase() 써도 되는데, 만약 파일에 특수문자가 있으면 아마 제대로 받아내지 못했을 것이다.

/*
 * try(BufferedReader br = new BufferedReader(new FileReader("alphabet.txt"))) {
 * String str;
 * 
 * while(true) { 
 * str = br.readLine();
 * if(str == null) break;
 * System.out.print(str.toUpperCase()); // 소문자를 대문자로 바꿔주는 함수 .toUpperCase()
 *  }
 * }
 * catch(IOException e) { e.printStackTrace(); 
 *   }
 *  }
 * }
 */
