package Test;

import java.util.Scanner;

public class GradeTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//System.in �ٷ� Ű����
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >>");
		int math = sc.nextInt(); //int���� �ްڴ�. ������ ������� ���α׷� �̾���. �̶��� ������� Ű����� �Ѿ. enterġ�� ������� �ٽ� ���α׷����� �Ѿ.
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
	}

}
