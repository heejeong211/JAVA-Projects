import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length(); // ���� ���� ��������
	}
	
}


public class ComparatorString {

	public static void main(String[] args) { // �Ʒ� ���� ������ TreeSet�� �⺻������ compareTo()�� ȣ�� �Ѵ�.
		TreeSet<String> tree = new TreeSet<>(new StringComparator()); // String Ŭ������ ���� ������ ���� ������(�����ڵ��)�̴�. �̸� ���� ������ �ٲٴ� ����.
		tree.add("Box");
		tree.add("Rabbit");
		tree.add("Robot");
		
		for(String s : tree)
			System.out.print(s.toString() + '\t');
		System.out.println();

	}

}
