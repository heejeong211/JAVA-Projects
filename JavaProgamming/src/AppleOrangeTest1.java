
class Box4<T> { // ���׸�Ÿ��  Object�� T�� �ٲ�.
	private T ob; 
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class AppleOrangeTest1 {

	public static void main(String[] args) {
		Box4<Apple> aBox = new Box4<Apple>(); // ���ڻ���.
		Box4<Orange> oBox = new Box4<Orange>(); // ���ڻ���.
		
		aBox.set(new Apple()); // ���ڿ� ����� ��´�.          //aBox.set("Apple"); ������ ������ ������.
		oBox.set(new Orange()); // ���ڿ� �������� ��´�.       //oBox.set("Orange");
		
		Apple ap = aBox.get(); // ���ڿ� ����� ������.      // ����ȯ ���� �� �ʿ䰡 ����. �̹� Apple�� Ÿ���� �ٲ���� ������.  
		Orange op = oBox.get(); // ���ڿ� �������� ������.    
		
		System.out.println(ap);
		System.out.println(op);

	}

}
