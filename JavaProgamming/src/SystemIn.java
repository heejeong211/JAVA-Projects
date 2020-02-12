import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System은 클래스 in은 static 참조형 변수. in은 InputStream의 참조형 변수.
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);

	}

}
