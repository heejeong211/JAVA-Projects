
class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

// ���� ���ڴ� ����� �������� ���� �� �ִ�.
class Box3 { // �����̵� �����ϰ� ���� �� �ִ� ����.
	private Object ob; // Object�� ����� ������ ����� �������� ������ �����ϱ� ���ؼ�.
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}


public class AppleOrangeTest {

	public static void main(String[] args) {
		Box3 aBox = new Box3(); // ���ڻ���.
		Box3 oBox = new Box3(); // ���ڻ���.
		
		aBox.set(new Apple()); // ���ڿ� ����� ��´�.          //aBox.set("Apple"); Ŭ���� Apple�� �־�� �ϴµ� ���ڿ� Apple�� ����. ������ ���������δ� �߸��Ѱ� ���� ������ ������ ���� ����.
		oBox.set(new Orange()); // ���ڿ� �������� ��´�.       //oBox.set("Orange");
		
		Apple ap = (Apple)aBox.get(); // ���ڿ� ����� ������.        //System.out.println(aBox.get()); ���� set�� Apple ���ڿ��� ���� ����Ǿ��� ������ ����� Apple�� ����. �̰� ������ ������ �ȳ��� ��Ÿ�ӿ����� �ȳ�.
		Orange op = (Orange)oBox.get(); // ���ڿ� �������� ������.    //System.out.println(oBox.get());
		
		System.out.println(ap);
		System.out.println(op);
	}

}

// ��¿ �� ���� �� ��ȯ�� ������ ���ݵȴ�.
// �׸��� �̴� �����Ϸ��� ���� �߰� ���ɼ��� ���ߴ� ����� �̾�����.