
public class Array2 {

	public static void main(String[] args) {
		int[][] arr = {
				{11},
				{22, 33},
				{44, 55, 66}
		};
		
		// �迭�� ������� ���� ���
		for(int i = 0; i < arr.length; i++) { // 3�� �̾Ƴ�����.
			for(int j = 0; j < arr[i].length; j++) { // 3�� �̾Ƴ�����. �� i�� ���� ���� �ϳ� ������ �� �ุ ��µ�.
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}