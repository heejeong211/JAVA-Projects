
public class Return {
	
	public static void main(String[] args) {
		
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}
	
	public static void divide(int num1, int num2) {
		if (num2 == 0) { //0�̸� ���� �ؿ��� ���� ���� ����
			System.out.println("0���� ���� �� �����ϴ�.");
			 return; // void�̴ϱ� ���� ��ȯ ���� �޼ҵ常 ����
		}
		
		System.out.println("������ ���: " + (num1/num2));
	}

}
