import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1�� �������� ����. 1000�� �и������� ���� �������� ���α׷����� 1�� �����. 1�� �ڿ� �ٽ� �����϶�. ������ 1�� ���� ���� �� ���ȿ� �ٸ� ���α׷��� ���ؽ�Ʈ ����Ī�� �ض�(�ٸ� ���α׷��� CPU�� ���)
			}
			catch(Exception e) {
				
			}
		}
	}

}

// ��޸���ũ 
// �Է�â�� �߰� ���� �ƹ��͵� �ȴ����� �ؿ��� ������ �ȵ�.
// ������� ����� �Է�â�� �ȱ�ٷ��� �ȴ�.