package Calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		String op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		int a = sc.nextInt();
		op = sc.next();
		int b = sc.nextInt();
		
		if (op.equals("+")) {
			add.setValue(a, b);
			System.out.println(add.calculator());
		} else if (op.equals("-")) {
			sub.setValue(a, b);
			System.out.println(sub.calculator());
		} else if (op.equals("*")) {
			mul.setValue(a, b);
			System.out.println(mul.calculator());
		} else if (op.equals("/")) {
			div.setValue(a, b);
			System.out.println(div.calculator());
		} 

	}


}
