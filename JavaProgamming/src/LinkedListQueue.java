import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>(); // LinkedList<E> �ν��Ͻ� ����
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		// ������ ������ ������ Ȯ��(���� ���� �������� ������ Ȯ��)
		System.out.println("next: " + que.peek());
		
		// ù ��°, �� ��° �ν��Ͻ� ������
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		// ������ ������ ������ Ȯ��
		System.out.println("next: " + que.peek());
		
		// ������ �ν��Ͻ� ������
		System.out.println(que.poll());
	}

}
