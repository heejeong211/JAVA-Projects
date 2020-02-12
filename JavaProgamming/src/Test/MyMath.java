package Test;

public class MyMath {
	
	public static int myMin(int[] a) {
		int min = a[0]; // min값을 받을 자리 구함. 빈 공간 잡아 놓기.
		for(int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static int myMax(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}

/*public static int myMin(int[] arr) {
 * int min = Imteger.MAX_VALUE;
 * 
 * for(int num : arr) {
 * if(min > num) {
 * min = num;
 *   }
 * }
 * return min;
 * }
 * */
 


/*public static void main(String[] args) {
 * 
 * int[] arr = new int[5];
 * int[] arr2 = {5, 4, 3, 2, 1};
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * for(int i = 0; i < arr.length; i++) {
 * arr[i] = sc.nextInt();
 * }
 * 
 * System.out.println(MyMath.myMin(arr));
 * }
 * */
 