
public class ArrayFor {

	public static void main(String[] args) {
		String[] sr = new String[7];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch Cafe");
		
		int cnum = 0;
		for(int i = 0; i < sr.length; i++) 
			cnum += sr[i].length();
		
		System.out.println("총 문자의 수: " + cnum);
		

	}

}

// 배열 요소는 반목문을 통해 순차적 접근이 가능하며, 이것은 배열이 가진 큰 장접 중 하나이다.