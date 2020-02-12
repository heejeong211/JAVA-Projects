import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 컬렉션 인스턴스 생성 // LinkedList<>(); 링크드리스크 사용하고 싶으면 ArrayList<>만 바꾸면 됨.
		
		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 저장된 문자열 인스턴스의 참조
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i) + '\t');
		System.out.println();
			
		list.remove(0);
		
		// 첫번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(0)+ '\t');
		System.out.println();
			
		
		

	}

}
