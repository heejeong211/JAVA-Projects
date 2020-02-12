package Test;

import java.util.Scanner;

public class GradeTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//System.in 바로 키보드
		
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >>");
		int math = sc.nextInt(); //int값을 받겠다. 보통은 제어권이 프로그램 이었음. 이때는 제어권이 키보드로 넘어감. enter치면 제어권이 다시 프로그램한테 넘어감.
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
	}

}
