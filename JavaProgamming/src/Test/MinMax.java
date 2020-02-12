package Test;

public class MinMax implements IMaxMin {

	@Override
	public double max(double[] arr) {
		double max = arr[0];
		for (double num : arr) {
			if(max < num) {
				max = num;
			}
		}
		
		return max;
	}

	@Override
	public double min(double[] arr) {
		double min = arr[0];
		for (double num : arr) {
			if(min > num) {
				min = num;
			}
		}
		
		return min;
	}

}
