import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>(); // TreeMap<>() 으로 바꾸면 정렬해서 나옴.
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet(); // HashMap<K, V>으로는 접근 안되선 Set<>을 사용한거임.
		
		// 전체 Key 출력(for-each문 기반)
		for(Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		// 전체 Value 출력(for-each문 기반)
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		
		// 전체 Value 출력 (반복자 기반)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();

	}

}
