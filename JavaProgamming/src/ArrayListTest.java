import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // �÷��� �ν��Ͻ� ���� // LinkedList<>(); ��ũ�帮��ũ ����ϰ� ������ ArrayList<>�� �ٲٸ� ��.
		
		// �÷��� �ν��Ͻ��� ���ڿ� �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// ����� ���ڿ� �ν��Ͻ��� ����
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i) + '\t');
		System.out.println();
			
		list.remove(0);
		
		// ù��° �ν��Ͻ� ���� �� ������ �ν��Ͻ����� ����
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(0)+ '\t');
		System.out.println();
			
		
		

	}

}
