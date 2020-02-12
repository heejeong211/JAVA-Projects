
public class LogicalOp {
	
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		//변수 num1에 저장된 값이 1과 100 사이의 수인가?
		result = (1 < num1) && (num1 < 100);
		System.out.println("1 초과 100 미만인가? " + result);
		
		//변수 num2에 저장된 값이 2 또는 3의 배수인가?
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가? " + result);
		
		//변수 num1이 0인가?
		result = !(num1 != 0); //참이 아닌데 앞에 not이 붙어서 false가 나옴
		System.out.println("0 인가? " + result);
	}

}
