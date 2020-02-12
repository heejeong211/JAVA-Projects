package Test;

public class Test4 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) { 
				System.out.print("*");
			}
			//System.out.print("\n");
			System.out.println();
		}
		
		
		/*for (int i = 5; i >= 1; i--) {
		    
		      for (int j = 1; j <= i; j++) { 
				   System.out.print("*");
			}
			System.out.println();
		 */
		
		/*for (int i = 1; i <= 5; i++) {
		      
		      for (int j = 1; j <=5-i+1; j++) { //부등호 때문에 +1 해야 함.
		      System.out.print(*);
		    }
		    System.out.println();
		 */
		
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
