
class DBox<L, R> {
	 private L left; // ���� ���� ����
	 private R right; // ������ ���� ����
	 
	 public void set(L o, R r) {
		 left = o;
		 right = r;
	 }
	 
	 @Override
	 public String toString() {
		 return left + " & " + right;
	 }
}

public class DBoxTest {
	
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>(); // Integer ���� Ŭ����
		box.set("Apple", 25); // 25 ���� �ڽ� 
		System.out.println(box);
	}

}
