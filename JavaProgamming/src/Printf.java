
public class Printf {

	public static void main(String[] args) {
		int age = 20;
		double height = 178.2;
		String name = "YOON SUNG WOO";
		
		System.out.printf(" name: %s \n", name); //%s -> String
		System.out.printf(" age: %d \n height: %e \n\n", age, height);
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.printf(" %g \n", 0.00014); //소수점 (소수점 다섯자리 까지는 소수점으로 나옴.)
		System.out.printf(" %g \n", 0.000014); // 지수 가수? (소수점 여섯자리 이후부터는 지수가수로 표현됨.)
	}

}
