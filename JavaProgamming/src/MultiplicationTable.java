
public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) { // 2�ܺ��� 9�ܱ��� ���� ���� �ٱ��� for��
			System.out.println("--------------");
			
			for (int j = 1; j <= 9; j++) { // 1���� 9������ ���� ���� ���� for��
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
	}

}
