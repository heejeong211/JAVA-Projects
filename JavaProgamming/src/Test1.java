
public class Test1 {

	public static void main(String[] args) {

		double num1 = 3; //원래는 int
		double num2 = 4; //int

		double result = num1 / num2; //int

		System.out.println(result);
	}

}

/*
 * int num1 = 3; 
 * int num2 = 4;
 * 
 * double result = num1/(double)num2;
 * 
 * System.out.println(result); => 결과값 0 왜냐하면 num들이 int형이기 때문.
 * 
 * 
 * int num1 = 3;
 * int num2 = 4;
 * 
 * double result = num1/(double)num2; 
 * 
 * System.out.println(result); => 명시적 형변환 했기 때문에 0.75나옴.
 * 
 * 
 * int num1 = 3; 
 * int num2 = 4;
 * 
 * double result = (double)(num1/num2);
 * 
 * System.out.println(result); => 결과값 0.0 왜냐하면 double로 바꾸기 전에 나누기하는 괄호를 먼저 하기 때문.
 */