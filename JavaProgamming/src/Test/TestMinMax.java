package Test;

public class TestMinMax {

	public static void main(String[] args) {
		
		double arr[] = {1.3, 5.6, 4.7, 9.6, 4.6};
 		
		IMaxMin mm = new MinMax();
		
		System.out.println("최대값은: " + mm.max(arr));
		System.out.println("최소값은: " + mm.min(arr));

	}

}
