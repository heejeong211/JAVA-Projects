
public class Test1 {

	public static void main(String[] args) {

		double num1 = 3; //������ int
		double num2 = 4; //int

		double result = num1 / num2; //int

		System.out.println(result);
	}

}

/*
 * int num1 = 3; 
 * int num2 = 4;
 * 
 * double result = num1/(double)num2;
 * 
 * System.out.println(result); => ����� 0 �ֳ��ϸ� num���� int���̱� ����.
 * 
 * 
 * int num1 = 3;
 * int num2 = 4;
 * 
 * double result = num1/(double)num2; 
 * 
 * System.out.println(result); => ����� ����ȯ �߱� ������ 0.75����.
 * 
 * 
 * int num1 = 3; 
 * int num2 = 4;
 * 
 * double result = (double)(num1/num2);
 * 
 * System.out.println(result); => ����� 0.0 �ֳ��ϸ� double�� �ٲٱ� ���� �������ϴ� ��ȣ�� ���� �ϱ� ����.
 */