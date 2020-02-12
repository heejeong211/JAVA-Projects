
public class RelationalOp {
	
	public static void main(String[] args) {
		System.out.println("3 >= 2 : " + (3 >=2));
		System.out.println("3 <= 2 : " + (3 <= 2));
		System.out.println("7.0 == 7 : " + (7.0 == 7));  //7.0은 double형, 7은 int 비교연산을 하고 있기 때문에 double로 형변환을 시켜줘서 int 7이 double 7이 되서 true가 나온 것임. 
		System.out.println("7.0 != 7 : " + (7.0 != 7));
	}

}
