
public class ForEach {

	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5};
		
		// �迭 ��� ��ü ���
		for(int e : ar) { 
			System.out.println(e + " ");
		}
		System.out.println(); // �ܼ� �� �ٲ��� ��������
		
		int sum = 0;
		
		// �迭 ����� ��ü �� ���
		for(int e : ar) {
			sum += e;
		}
		System.out.println("sum: " + sum);

	}

}
