
public class Break {
	
	public static void main(String[] args) {
		int num = 1;
		boolean search = false;
		
		//ó�� ������ 5�� ������� 7�� ����� ���� ã�� �ݺ���. �׷��� 70�� �ȳ���. ó���� ������ �ָ� ����϶�� �߱� ����.
		while (num < 100) {
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				search = true;
				break;
			}
			num++;
		}
		
		if(search) {
			System.out.println("ã�� ����: " + num);
		}else {
			System.out.println("5�� ������� 7�� ����� ���� ã�� ���߽��ϴ�.");
		}
	}

}
