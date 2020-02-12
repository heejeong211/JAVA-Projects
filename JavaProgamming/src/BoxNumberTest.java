
class Box6<T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class BoxNumberTest {

	public static void main(String[] args) {
		Box6<Integer> iBox = new Box6<>();
		iBox.set(24);
		
		Box6<Double> dBox = new Box6<>();
		dBox.set(5.97);

	}

}
