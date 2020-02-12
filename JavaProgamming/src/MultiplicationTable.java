
public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) { // 2단부터 9단까지 진행 위한 바깥쪽 for문
			System.out.println("--------------");
			
			for (int j = 1; j <= 9; j++) { // 1부터 9까지의 곱을 위한 안쪽 for문
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
	}

}
