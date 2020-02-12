import java.util.Iterator;
import java.util.LinkedList;

public class PrimetiveTypeDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10); // 저장 과정에서 오토 박싱 진행
		list.add(20);
		list.add(30);
		
		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			n = itr.next(); // 오토 언박싱 진행
			System.out.println(n + "\t");
		}
		System.out.println();

	}

}
// 오토 박싱과 오토 언박싱 덕분에 컬렉션 인스턴스에 기본자료형의 값도 저장 가능하다.