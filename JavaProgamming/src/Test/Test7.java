package Test;

public class Test7 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 1) {
				add(i);
			}
		}
	}
	public static void add(int num) {
		int total = 0;
		total = total + num;
		System.out.println(total);
	}

}

/*public static int pulsOdd() {
 * 
 *    int sum = 0;
 *    
 *    for(int i = 1; i <= 100; i++) {
 *        if(i%2 == 1)
 *        sum = sum + i;
 *    }
 *    
 *    return sum;
 *  }
 * 
 * public static void main(String[] args) {
 *    System.out.println(pulsOdd());
 *    }
 */
 