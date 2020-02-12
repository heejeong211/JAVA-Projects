
class Box7<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class EmptyBoxFactory {
	public static <T> Box7<T> makeBox() {
		Box7<T> box = new Box7<T>();
		return box;
	}
}

public class EmptyBoxTest {

	public static void main(String[] args) {
		Box7<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		// Box7<Integer> iBox = EmptyBoxFactory.makeBox(); // �̷��� �ص� ��. �����Ϸ��� �˾Ƽ� <Integer> �־���.
		iBox.set(25);
		System.out.println(iBox.get());

	}

}
