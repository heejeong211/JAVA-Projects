import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>(); // Deque<String> deq = new LinkedList<>(); ������.
		
		// ������ �ְ�
		deq.offerFirst("1. Box");
		deq.offerFirst("2. Toy");
		deq.offerFirst("3. Robot");
		
		// �տ��� ������
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}

}
