
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
		// Box7<Integer> iBox = EmptyBoxFactory.makeBox(); // 이렇게 해도 됨. 컴파일러가 알아서 <Integer> 넣어줌.
		iBox.set(25);
		System.out.println(iBox.get());

	}

}
