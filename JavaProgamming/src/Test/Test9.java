package Test;

public class Test9 {

	public static void printGuGu(int start, int end) { //두 수를 바꾸는 걸 스왑이라고 함.
		
		int temp;
		
		if (start > end) { //swap알고리즘
			temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}	
	}
	public static void main(String[] args) {
		
		printGuGu(9, 1);
		
	}
}
