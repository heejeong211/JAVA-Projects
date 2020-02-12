
public class Return {
	
	public static void main(String[] args) {
		
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}
	
	public static void divide(int num1, int num2) {
		if (num2 == 0) { //0이면 굳이 밑에꺼 까지 실행 안함
			System.out.println("0으로 나눌 수 없습니다.");
			 return; // void이니까 값의 반환 없이 메소드만 종료
		}
		
		System.out.println("나눗셈 결과: " + (num1/num2));
	}

}
