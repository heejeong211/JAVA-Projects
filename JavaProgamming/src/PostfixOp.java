
public class PostfixOp {
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println((num++) + " "); //��� �Ŀ� ���� ���� / �����ݷ�(;) �ٷ� ������ ����
		System.out.println((num++) + " "); //��� �Ŀ� ���� ����
		System.out.println(num + "\n");
		
		System.out.println((num--) + " "); //��� �Ŀ� ���� ����
		System.out.println((num--) + " "); //��� �Ŀ� ���� ����
		System.out.println(num);
	}

}