
class Box5<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}



public class BoxTest {

	public static void main(String[] args) {
		Box5<String> sBox = new Box5<>();
		sBox.set("I am so happy!");
		
		Box5<Box5<String>> wBox = new Box5<>();
		wBox.set(sBox);
		
		Box5<Box5<Box5<String>>> zBox = new Box5<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());

	}

}
