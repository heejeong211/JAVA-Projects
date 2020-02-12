import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcetionCase {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a? ");
			int n1 = kb.nextInt();
			System.out.print("a/b...b? ");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2); // ���� �߻� ���� (����ڰ� �����߻���Ŵ -> JVM�� �� ������ �߰�)
			
		}
		catch(InputMismatchException e) { // Ŭ������� ������, try catch�� ������ ������ ��������. JVM�� ������ �ּҸ� ����� �ڱ����� �˸´� e �ּҿ� ��������.
			//e.getMessage(); //�̷��� �ϸ� ������. �׷��� �ؿ� catch�� �� �ްų� �ƴϸ� ���� ������ Exception�� �����.
			e.printStackTrace();
		} 
		catch(ArithmeticException e) {
			//e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println("Good bye~~!");

	}

}

//ArithmeticException
//System.out.println(e.getMessage()); �� ������ ������ ������.