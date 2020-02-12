import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length(); // 글자 수로 오름차순
	}
	
}


public class ComparatorString {

	public static void main(String[] args) { // 아래 글이 없으면 TreeSet은 기본적으로 compareTo()를 호출 한다.
		TreeSet<String> tree = new TreeSet<>(new StringComparator()); // String 클래스의 정렬 기준은 사전 편찬순(유니코드순)이다. 이를 길이 순으로 바꾸는 문장.
		tree.add("Box");
		tree.add("Rabbit");
		tree.add("Robot");
		
		for(String s : tree)
			System.out.print(s.toString() + '\t');
		System.out.println();

	}

}
