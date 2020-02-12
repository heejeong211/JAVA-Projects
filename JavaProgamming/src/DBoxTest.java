
class DBox<L, R> {
	 private L left; // 왼쪽 수납 공간
	 private R right; // 오른쪽 수납 공간
	 
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
		DBox<String, Integer> box = new DBox<String, Integer>(); // Integer 래퍼 클래스
		box.set("Apple", 25); // 25 오토 박싱 
		System.out.println(box);
	}

}
