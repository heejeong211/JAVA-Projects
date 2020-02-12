package Test;

public class Test3 {
	
	public static void main(String[] args) {
		
		/*for (int i = 2; i <= 9; i++) {
		       
		       if(i % 2 == 1) // 홀수라면 다시 바깥쪽 for문
		          continue;
			
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
				
				
		  for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				if(i % 2 == 1)
				    break; // 안쪽 for문에서 나가서 바깥쪽 for문으로 감.
				
				System.out.println(i + "X" + j + "=" + (i*j));
		 */
		
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				if (i % 2 == 0)
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
		
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				if ((i*j) % 2 == 1)
				System.out.println(i + "X" + j + "=" + (i*j));
				
			}
		}
		
		for (int i = 9; i >= 2; i--) {
			
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			
			}
		}
	}

}
