import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str1 = sc.nextLine();
		
		System.out.print("���ڿ� �Է�: ");
		String str2 = sc.nextLine();
		
		System.out.printf("�ӷµ� ���ڿ� 1: %s \n", str1);
		System.out.printf("�Էµ� ���ڿ� 2: %s \n", str2);

	}

}
