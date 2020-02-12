
interface Getable<T> {
	public T get();
}

// 인터페이스 Getable<T>를 구현하는 Box8<T> 클래스
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
		
		// Box8<T>가 Getable<T>를 구현하므로 참조 가능
		Getable<Toy> gt = box; // 다형성 적용
		System.out.println(gt.get());

	}

}
