import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcetionCase {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a? ");
			int n1 = kb.nextInt();
			System.out.print("a/b...b? ");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2); // 예외 발생 지점 (사용자가 에러발생시킴 -> JVM이 그 에러를 발견)
			
		}
		catch(InputMismatchException e) { // 클래스명과 변수명, try catch가 있으면 에러를 등져버림. JVM이 에러난 주소를 띄워서 자기한테 알맞는 e 주소에 전달해줌.
			//e.getMessage(); //이렇게 하면 에러남. 그래서 밑에 catch를 더 달거나 아니면 차라리 조상인 Exception을 써야함.
			e.printStackTrace();
		} 
		catch(ArithmeticException e) {
			//e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println("Good bye~~!");

	}

}

//ArithmeticException
//System.out.println(e.getMessage()); 왜 에러가 나는지 보여줌.