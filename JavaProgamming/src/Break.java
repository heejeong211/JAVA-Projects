
public class Break {
	
	public static void main(String[] args) {
		int num = 1;
		boolean search = false;
		
		//처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문. 그래서 70은 안나옴. 처음에 나오는 애만 출력하라고 했기 때문.
		while (num < 100) {
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				search = true;
				break;
			}
			num++;
		}
		
		if(search) {
			System.out.println("찾는 정수: " + num);
		}else {
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
		}
	}

}
