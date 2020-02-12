package Test;

class DBox<S, N> {
	private S s;
	private N n;
	
	public void set(S s, N n) {
		this.s = s;
		this.n = n;
	}
	
	@Override
	public String toString() {
		return s + " & " + n;
	}
}

class DDBox<O, T> {
	private O o;
	private T t;
	
	public void set(O o, T t) {
		this.o = o;
		this.t = t;
	
	}
	
	@Override
	public String toString() {
		return o + "\n" + t; // o.toString() + "\n" + t.toString(); ��ü + ���ڿ� + ��ü -> ���ڿ��� ��� �׷��� toString() ���ص� ���ڿ��� ��µ�.
	}
}

public class DDBoxDemo {

	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		
		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		
		ddbox.set(box1, box2);
		
		System.out.println(ddbox);
	}

}
