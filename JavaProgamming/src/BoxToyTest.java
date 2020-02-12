
interface Getable<T> {
	public T get();
}

// �������̽� Getable<T>�� �����ϴ� Box8<T> Ŭ����
class Box8<T> implements Getable<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}

	@Override
	public T get() {
		return ob;
	}
	
}

class Toy {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

public class BoxToyTest {

	public static void main(String[] args) {
		Box8<Toy> box = new Box8<>();
		box.set(new Toy());
		
		// Box8<T>�� Getable<T>�� �����ϹǷ� ���� ����
		Getable<Toy> gt = box; // ������ ����
		System.out.println(gt.get());

	}

}
