import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System�� Ŭ���� in�� static ������ ����. in�� InputStream�� ������ ����.
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);

	}

}
